package com.compilador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java -jar demo-1.0-jar-with-dependencies.jar <archivo.txt>");
            System.exit(1);
        }

        String nombreArchivo = args[0];

        try {
            CharStream input = CharStreams.fromFileName(nombreArchivo);
            System.out.println("Analizando archivo: " + nombreArchivo);

            // Crear lexer con manejo personalizado de errores
            MiniLenguajeLexer lexer = new MiniLenguajeLexer(input);
            List<String> erroresLexicos = new ArrayList<>();
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    String errorMsg = "ERROR LÉXICO en línea " + line + ":" + charPositionInLine + " - " + msg;
                    erroresLexicos.add(errorMsg);
                    throw new ParseCancellationException(errorMsg);
                }
            });

            // Análisis léxico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            // Mostrar tokens si no hay errores léxicos
            if (erroresLexicos.isEmpty()) {
                System.out.println("\n=== ANÁLISIS LÉXICO ===");
                System.out.printf("%-20s %-30s %-10s %-10s\n", "TIPO", "LEXEMA", "LÍNEA", "COLUMNA");
                System.out.println("-------------------------------------------------------------------");
                for (Token token : tokens.getTokens()) {
                    if (token.getType() != Token.EOF) {
                        String tokenName = MiniLenguajeLexer.VOCABULARY.getSymbolicName(token.getType());
                        if (tokenName == null) {
                            tokenName = "'" + token.getText() + "'";
                        }
                        System.out.printf("%-20s %-30s %-10d %-10d\n",
                                tokenName, token.getText(), token.getLine(), token.getCharPositionInLine());
                    }
                }
                System.out.println("\n✅ Análisis léxico completado sin errores.");
            } else {
                erroresLexicos.forEach(System.out::println);
                System.exit(1);
            }

            /// Crear parser
            MiniLenguajeParser parser = new MiniLenguajeParser(tokens);
            ParseTree tree = parser.program();  // Asegurate de usar el nombre correcto de la regla raíz

            // Mostrar árbol sintáctico
            System.out.println("\n=== REPRESENTACIÓN DEL ÁRBOL SINTÁCTICO ===");
            System.out.println(tree.toStringTree(parser));

            // Listener para tabla de símbolos
            SimbolosListener listener = new SimbolosListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            // Mostrar tabla de símbolos
            listener.getTablaSimbolos().imprimir();

            // Mostrar errores semánticos (si hay)
            if (!listener.getErrores().isEmpty()) {
                System.out.println("Errores encontrados:");
                listener.getErrores().forEach(System.out::println);
            } else {
                System.out.println("No se encontraron errores.");
            }

        } catch (IOException e) {
            System.err.println("❌ Error al leer el archivo: " + e.getMessage());
        } catch (ParseCancellationException e) {
            System.err.println("\n❌ " + e.getMessage());
        } catch (Exception e) {
            System.err.println("❌ Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}