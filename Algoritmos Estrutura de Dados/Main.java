import Pilha.Pilha;
import Fila.Fila;
import Estruturas_Flexiveis.java.*;

class Main {
    public static void main(String[] args) throws Exception {
        int size = 20;
        // Pilha stack = new Pilha(size);
        // Fila queue = new Fila(size);
        // ListaEncadeada linkedList = new ListaEncadeada();
        // ListaDuplamenteEncadadeada doublyLinkedList = new ListaDuplamenteEncadadeada();
        // int linkedListNumber = size;
        PilhaEncadeada chainedStack = new PilhaEncadeada();
        FilaEncadeada chainedQueue = new FilaEncadeada();

        System.out.println(" === Inserir ===");

        for(int i = 0; i < size; i++) { 
            // stack.push(numbeRandom.nextInt());
            // queue.enqueue(i);
            // linkedList.insert(linkedListNumber--, i);
            // doublyLinkedList.insert(linkedListNumber--, i);
            chainedStack.push(i);
            chainedQueue.enqueue(i);
        }

        // stack.show();
        // queue.show();
        // linkedList.show();
        // doublyLinkedList.showPrevious();
        chainedStack.show();
        chainedQueue.show();

        System.out.println(" === Remover ===");

        for(int i = 0; i < (size / 2); i++) {
            // stack.pop();
            // queue.dequeue();
            // linkedList.remove(i);
            // doublyLinkedList.remove(i);
            chainedStack.pop();
            chainedQueue.dequeue();
        }

        // stack.show();
        // queue.show();
        // linkedList.show();
        // doublyLinkedList.showPrevious();
        chainedStack.showRec();
        chainedQueue.show();
    }
}