import Pilha.Pilha;
import Fila.Fila;
import Estruturas_Flexiveis.java.*;

class Main {
    public static void main(String[] args) throws Exception {
        int size = 20;
        // Pilha stack = new Pilha(size);
        // Fila queue = new Fila(size);
        // ListaEncadeada linkedList = new ListaEncadeada();
        ListaDuplamenteEncadadeada doublyLinkedList = new ListaDuplamenteEncadadeada();
        int linkedListNumber = size;

        System.out.println(" === Inserir ===");

        for(int i = 0; i < size; i++) { 
            // stack.push(numbeRandom.nextInt());
            // queue.enqueue(i);
            // linkedList.insert(linkedListNumber--, i);
            doublyLinkedList.insert(linkedListNumber--, i);
        }

        // stack.show();
        // queue.show();
        // linkedList.show();
        doublyLinkedList.showPrevious();

        System.out.println(" === Remover ===");

        for(int i = 0; i < (size / 2); i++) {
            // stack.pop();
            // queue.dequeue();
            // linkedList.remove(i);
            doublyLinkedList.remove(i);
        }

        // stack.show();
        // queue.show();
        // linkedList.show();
        doublyLinkedList.showPrevious();
    }
}