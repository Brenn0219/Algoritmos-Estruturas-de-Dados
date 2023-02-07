package Estruturas_Flexiveis.java;

class Pilha {
    CelulaSimples top;

    Pilha() {
        top = null;
    }

    // Metodo de Inserir (Empilhar)
    public void push(int x) {
        top = new CelulaSimples(x);
        top = top.next;
    }

    
}