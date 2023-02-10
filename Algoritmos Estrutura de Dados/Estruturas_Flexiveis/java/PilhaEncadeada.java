package Estruturas_Flexiveis.java;

public class PilhaEncadeada {
    CelulaSimples top;

    public PilhaEncadeada() {
        top = null;
    }

    // Metodo de Inserir (Empilhar)
    public void push(int x) {
        CelulaSimples tmp = new CelulaSimples(x);
        tmp.next = top;
        top = tmp;
        tmp = null;
    }

    // Metodo de Remover (Desempilhar)
    public int pop() throws Exception {
        if(top == null) {
            throw new Exception("Erro ao Remover");
        }

        int numberRemoved = top.cell;
        CelulaSimples tmp = top;

        top = top.next;
        tmp.next = tmp = null;

        return numberRemoved;
    }

    // Metodo para Verificar se a Pilha esta Vazia
    public boolean empty() {
        return (top == null);
    }

    // Metodo de Mostrar os Elementos
    public void show() {
        for(CelulaSimples i = top; i != null; i = i.next) {
            if(i.next != null) {
                System.out.print(i.cell + " - ");
            } else {
                System.out.println(i.cell);
            }
        }
    }

    // Metodo de Mostrar os Elementos de traz para frente
    private void showRec(CelulaSimples i) {
        if(i != null) {
            showRec(i.next);
            System.out.print(i.cell + " - ");
        }
    }

    public void showRec() {
        showRec(top);
    }
}