package Estruturas_Flexiveis.java;

public class CelulaDupla {
    public int cell;
    public CelulaDupla next, previous;

    public CelulaDupla(int x) {
        cell = x;
        next = previous = null;
    }
}
