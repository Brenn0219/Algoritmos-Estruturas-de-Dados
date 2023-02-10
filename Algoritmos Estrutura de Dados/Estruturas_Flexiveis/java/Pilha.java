package Estruturas_Flexiveis.java;

class Pilha {
    CelulaSimples top;

    Pilha() {
        top = null;
    }

    // Metodo de Inserir (push)
    public void push(int x) {
        CelulaSimples tmp = new CelulaSimples(x);
        tmp.next = top;
        top = tmp;
        tmp = null;
    }

    // Metodo de Remover (pop)
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
        System.out.println(i.cell);
    }

    public void showRec() {
        showRec(top);
    }
}