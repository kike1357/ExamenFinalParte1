package examenfinalparte1;


public class Principal {
    
    int q;
    
public Principal(int j, int m) {
    q=metodo(j,m);
}

public Principal(int j) {
        q=metodo(j,j);
}
    
public Principal() { 
        q=-1;
    
}

public int metodo(int x, int x1) {
      return x + x1;
    }
}
