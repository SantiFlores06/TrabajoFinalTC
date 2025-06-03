package com.compilador;


import java.util.ArrayList;
import java.util.List;

/**
 * Implementación sencilla de una tabla de símbolos para el compilador
 */
public class TablaSimbolos {
    
    // Clase para representar un símbolo
    public static class Simbolo {
        private String nombre;
        private String tipo;        // int, char, double, void
        private String categoria;   // variable, funcion, parametro
        private int linea;
        private int columna;
        private String ambito;      // global o nombre_funcion
        private List<String> parametros;  // Solo para funciones (lista de tipos)
        
        public Simbolo(String nombre, String tipo, String categoria, int linea, int columna, String ambito) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.categoria = categoria;
            this.linea = linea;
            this.columna = columna;
            this.ambito = ambito;
            this.parametros = new ArrayList<>();
        }
        
        // Getters
        public String getNombre() { return nombre; }
        public String getTipo() { return tipo; }
        public String getCategoria() { return categoria; }
        public int getLinea() { return linea; }
        public int getColumna() { return columna; }
        public String getAmbito() { return ambito; }
        public List<String> getParametros() { return parametros; }
        
        // Agregar un parámetro a una función
        public void addParametro(String tipo) {
            parametros.add(tipo);
        }
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%-15s %-10s %-15s %-10d %-10d %-15s", 
                      nombre, tipo, categoria, linea, columna, ambito));
            
            if (!parametros.isEmpty()) {
                sb.append(" [");
                for (int i = 0; i < parametros.size(); i++) {
                    sb.append(parametros.get(i));
                    if (i < parametros.size() - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("]");
            }
            
            return sb.toString();
        }
    }
    
    // Lista de símbolos
    private List<Simbolo> simbolos;
    
    // Ámbito actual (global o nombre de función)
    private String ambitoActual;
    
    /**
     * Constructor
     */
    public TablaSimbolos() {
        this.simbolos = new ArrayList<>();
        this.ambitoActual = "global";
    }
    
    /**
     * Establece el ámbito actual
     */
    public void setAmbito(String ambito) {
        this.ambitoActual = ambito;
    }
    
    /**
     * Obtiene el ámbito actual
     */
    public String getAmbito() {
        return this.ambitoActual;
    }
    
    /**
     * Agrega un símbolo a la tabla
     * @param simbolo Símbolo a agregar
     * @return true si se agregó correctamente, false si ya existía en el mismo ámbito
     */
    public boolean agregar(Simbolo simbolo) {
        // Verificar si ya existe un símbolo con el mismo nombre en el mismo ámbito
        for (Simbolo s : simbolos) {
            if (s.getNombre().equals(simbolo.getNombre()) && 
                s.getAmbito().equals(simbolo.getAmbito())) {
                return false;
            }
        }
        
        // Agregar el símbolo a la tabla
        simbolos.add(simbolo);
        return true;
    }
    
    /**
     * Busca un símbolo por nombre en el ámbito actual y global
     * @param nombre Nombre del símbolo a buscar
     * @return El símbolo encontrado o null si no existe
     */
    public Simbolo buscar(String nombre) {
        // Primero buscar en el ámbito actual
        for (Simbolo s : simbolos) {
            if (s.getNombre().equals(nombre) && s.getAmbito().equals(ambitoActual)) {
                return s;
            }
        }
        
        // Si no se encuentra y no estamos en ámbito global, buscar en ámbito global
        if (!ambitoActual.equals("global")) {
            for (Simbolo s : simbolos) {
                if (s.getNombre().equals(nombre) && s.getAmbito().equals("global")) {
                    return s;
                }
            }
        }
        
        return null;
    }
    
    /**
     * Busca un símbolo por nombre y ámbito específico
     * @param nombre Nombre del símbolo
     * @param ambito Ámbito donde buscar
     * @return El símbolo encontrado o null si no existe
     */
    public Simbolo buscar(String nombre, String ambito) {
        for (Simbolo s : simbolos) {
            if (s.getNombre().equals(nombre) && s.getAmbito().equals(ambito)) {
                return s;
            }
        }
        return null;
    }
    
    /**
     * Imprime la tabla de símbolos
     */
    public void imprimir() {
        System.out.println("\n=== TABLA DE SÍMBOLOS ===");
        System.out.printf("%-15s %-10s %-15s %-10s %-10s %-15s %s\n", 
                         "NOMBRE", "TIPO", "CATEGORÍA", "LÍNEA", "COLUMNA", "ÁMBITO", "PARÁMETROS");
        System.out.println("--------------------------------------------------------------------------------------------");
        
        for (Simbolo s : simbolos) {
            System.out.println(s);
        }
    }
}