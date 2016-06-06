package examenfinalparte1;


public class Principal2 {
    
    int q;

 /**
     * Recoje las variables j y m
     * 
     * @param j el nombre que se le da a esa variable
     * @param m nombre que se le da a esa variable
     */    
public Principal2(int j, int m) {
    q=metodo(j,m);
}

/**
     * Recoje la variable j 
     * 
     * @param j el nombre que se le da a esa variable
     */ 
public Principal2(int j) {
        q=metodo(j,j);
}

/**
     * Contructor que no recoje nada simplemente resta -1
     */     
public Principal2() { 
        q=-1;
    
}

/**
     * Recoje la variable x y x1 y se retorna 
     * 
     * @param x el nombre que se le dio a la variable
     * @param x1 el nombre que se le dio a la variable
     */ 
public int metodo(int x, int x1) {
      return x + x1;
    }
}
