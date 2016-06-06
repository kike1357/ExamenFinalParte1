package examenfinalparte1;

import java.io.IOException;


public class Principal1 {
    
    
public static void main(String[] args) throws IOException{
    
    
        VisualizacionVariN();
        VisualizacionVariM();
        VisualizacionVarNN();
}
/**
     * Metodo que se usa para visualizar el valor final de la variable nn con un System.out.println
     */
    public static void VisualizacionVarNN() {
        Principal2 mn = new Principal2();
        int nn = mn.q;
        System.out.println("Es: " + nn);
    }

 /**
     * Metodo que se usa para visualizar el valor final de la variable m con un System.out.println
     */   
    public static void VisualizacionVariM() {
        Principal2 nm = new Principal2(10);
        int m = nm.q;
        System.out.println("Es: " + m);
    }
    
/**
     * Metodo que se usa para visualizar el valor final de la variable n con un System.out.println
     */
    public static void VisualizacionVariN() {
        Principal2 obj = new Principal2(10,20);
        int n = obj.q;
        System.out.println("Es: " + n);
    }
}
