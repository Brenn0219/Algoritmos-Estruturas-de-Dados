package Estruturas_Flexiveis.java;

public class FilaEncadeada {
    CelulaSimples first, last;

    public FilaEncadeada() {
        first = last = null;
    }

    // Metodo de Inserir (Enfileirar)
    public void enqueue(int x) {
        if(last == null) {
            last = first = new CelulaSimples(x);
        } else {
            last.next = new CelulaSimples(x);
            last = last.next;   
        }
    }

    // Metodo de Remover (Desenfileirar)
    public int dequeue() throws Exception {
        if(first == last) {
            throw new Exception("Erro ao Remover");
        }

        CelulaSimples tmp = first;
        int numberRemoved = first.cell;

        first = first.next;
        tmp.next = tmp = null;

        return numberRemoved;
    }

    // Metodo para Verificar se a Fila esta Vazia
    public boolean empty() {
        return (first == last);
    }

    // Metodo de Mostrar os Elementos
    public void show() {
        for(CelulaSimples i = first; i != null; i = i.next) {
            if(i.next != null) {
                System.out.print(i.cell + " - ");
            } else {
                System.out.println(i.cell);
            }
        }
    }
}