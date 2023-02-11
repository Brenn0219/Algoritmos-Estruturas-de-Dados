import Estruturas_Flexiveis.java.*;
import Fila.java.Fila;
import Lista.java.Lista;
import Pilha.java.Pilha;

class Main {
    public static void main(String[] args) throws Exception {
        int size = 20, half = size;
        // Lista list = new Lista(size);
        // Pilha stack = new Pilha(size);
        // Fila queue = new Fila(size);
        // ListaEncadeada linkedList = new ListaEncadeada();
        // ListaDuplamenteEncadadeada doublyLinkedList = new ListaDuplamenteEncadadeada();
        // PilhaEncadeada chainedStack = new PilhaEncadeada();
        // FilaEncadeada chainedQueue = new FilaEncadeada();

        System.out.println(" === Inserir ===");

        for(int i = 0; i < size; i++) { 
            // list.insert(half--, i);
            // stack.push(numbeRandom.nextInt());
            // queue.enqueue(i);
            // linkedList.insert(half--, i);
            // doublyLinkedList.insert(half--, i);
            // chainedStack.push(i);
            // chainedQueue.enqueue(i);
        }

        // list.show();
        // stack.show();
        // queue.show();
        // linkedList.show();
        // doublyLinkedList.showPrevious();
        // chainedStack.show();
        // chainedQueue.show();

        System.out.println(" === Remover ===");

        for(int i = 0; i < (size / 2); i++) {
            // list.removeEnd();
            // stack.pop();
            // queue.dequeue();
            // linkedList.remove(i);
            // doublyLinkedList.remove(i);
            // chainedStack.pop();
            // chainedQueue.dequeue();
        }

        // list.show();
        // stack.show();
        // queue.show();
        // linkedList.show();
        // doublyLinkedList.showPrevious();
        // chainedStack.showRec();
        // chainedQueue.show();
    }
}