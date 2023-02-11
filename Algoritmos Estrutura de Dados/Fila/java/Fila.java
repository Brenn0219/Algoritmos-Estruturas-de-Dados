package Fila.java;

// FIFO (First In First Out)
public class Fila {
    private int[] queue;
    private int size, first, last;

    public Fila() {
        size = 10;
        first = last = 0;
        queue = new int[size + 1];
    }

    public Fila(int x) {
        size = x;
        first = last = 0;
        queue = new int[size + 1];
    }

    // Metodo de Inserir (Enfileirar)
    public void enqueue(int x) throws Exception {
        if(((last + 1) % queue.length) == first) {
            throw new Exception("Erro ao Inserir");
        }

        queue[last] = x;
        last = (last + 1) % queue.length;
    }

    // Metodo de Remover (Desenfileirar)
    public int dequeue() throws Exception {
        if(first == last) {
            throw new Exception("Erro ao Remover");
        }

        int numberRemoved = queue[first];
        first = (first + 1) % queue.length;

        return numberRemoved;
    }

    // Metodo para Verificar se a Fila esta Vazia
    public boolean empty() {
        return (first == last);
    }

    // Metodo de Mostrar os Elementos
    public void show() {
        for(int i = first; i != last; i = (i + 1) % queue.length) {
            if((i + 1) != last) {
                System.out.print(queue[i] + " - ");
            } else {
                System.out.println(queue[i]);
            }
        }
    }
}
