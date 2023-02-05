package Pilha;

// FILO - (First In Last Out)
public class Pilha {
    private int[] stack;
    private int size, top;

    public Pilha() {
        size = 10;
        top = 0;
        stack = new int[size];
    }

    public Pilha(int x) {
        size = x;
        top = 0;
        stack = new int[size];
    }

    // Metodo de Inserir (Empilhar)
    public void push(int x) throws Exception {
        if(top < size) {
            stack[top++] = x;
        } else { 
            throw new Exception("Erro ao Inserir");
        }
    }

    // Metodo de Remover (Desempilhar)
    public int pop() throws Exception {
        int numberRemoved = -1;

        if(top > 0) {
            numberRemoved = stack[top--];
        } else {
            throw new Exception("Erro ao Remover");
        }

        return numberRemoved;
    }

    // Metodo para Verificar se a Pilha esta Vazia
    public boolean empty() {
        if(top == 0) {
            return true; 
        } else {
            return false;
        }
    }

    // Metodo de Mostrar os Elementos 
    public void show() {
        int n = ((top >= size) ? size-1 : top);

        for(int i = 0; i <= n; i++) {
            if(i != n) {
                System.out.print(stack[i] + " - ");
            } else {
                System.out.println(stack[i]);
            }
        }
    }
}
