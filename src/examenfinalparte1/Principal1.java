package examenfinalparte1;

import java.io.IOException;


public class Principal1 {
    
    
public static void main(String[] args) throws IOException{
    
    
        VisualizacionVariN();
        VisualizacionVariM();
        VisualizacionVarNN();
}

    public static void VisualizacionVarNN() {
        Principal mn = new Principal();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }

    public static void VisualizacionVariM() {
        Principal nm = new Principal(10);
        int m = nm.i;
        System.out.println("Es: " + m);
    }

    public static void VisualizacionVariN() {
        Principal obj = new Principal(10,20);
        int n = obj.i;
        System.out.println("Es: " + n);
    }
}