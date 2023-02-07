package Estruturas_Flexiveis;

public class CelulaDupla {
    public int cell;
    public CelulaDupla next, previous;

    public CelulaDupla(int x) {
        cell = x;
        next = previous = null;
    }
}
