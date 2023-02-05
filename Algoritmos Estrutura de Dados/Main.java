import Pilha.Pilha;
import Fila.Fila;

class Main {
    public static void main(String[] args) throws Exception {
        int size = 20;
        //Pilha stack = new Pilha(size);
        Fila queue = new Fila(size);

        System.out.println(" === Inserir ===");

        for(int i=0; i<size; i++) { 
            //stack.push(numbeRandom.nextInt());
            queue.enqueue(i);
        }

        //stack.show();
        queue.show();

        System.out.println(" === Remover ===");

        for(int i=0; i<(size/2); i++) {
            //stack.pop();
            queue.dequeue();
        }

        //stack.show();
        queue.show();
    }
}