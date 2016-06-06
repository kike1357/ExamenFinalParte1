package examenfinalparte1;


public class Principal {
    
    int q;
    
public Principal(int j, int m) {
    q=met(j,m);
}

public Principal(int j) {
        q=met(j,j);
}
    
public Principal() { 
        q=-1;
    
}

public int met(int x, int x1) {
      return x + x1;
    }
}
