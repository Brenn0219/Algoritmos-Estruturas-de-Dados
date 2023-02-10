package Estruturas_Flexiveis.java;

public class CelulaSimples {
    public int cell;
    public CelulaSimples next;

    public CelulaSimples() {
        this(-999);
    }

    public CelulaSimples(int x) {
        cell = x;
        next = null;    
    }
}
