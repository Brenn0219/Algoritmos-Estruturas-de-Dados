package Estruturas_Flexiveis.java;

public class ListaDuplamenteEncadadeada {
    CelulaDupla first, last;

    public ListaDuplamenteEncadadeada() {
        first = new CelulaDupla(-1); // Celula Inicial (Cabecalho)
        last = first;
    }

    // Metodo de Inserir no Inicio
    public void insertStart(int x) {
        CelulaDupla tmp = new CelulaDupla(x);

        if(first == last) {
            first.next = tmp;
            last = tmp;
        } else {
            tmp.next = first.next;
            tmp.next.previous = tmp;
            first.next = tmp;
        }
    }

    // Metodo de Inserir no Final
    public void insertEnd(int x) {
        last.next = new CelulaDupla(x);

        if(last == first) {
            first.next = last.next;
        } else {
            last.next.previous = last;
        }

        last = last.next;
    }

    // Metodo para Inserir em qualquer Posicao 
    public void insert(int x, int position) throws Exception {
        if(position < 0 || position > size()) {
            throw new Exception("Erro ao Inserir - Posicao Invalida"); // Verifica a posicao
        } else if (position == 0) {
            insertStart(x);
        } else if (position == size()) {
            insertEnd(x);
        } else {
            CelulaDupla j = first.next;
            CelulaDupla tmp = new CelulaDupla(x);

            for(int i = 0; i < position; i++) {
                j = j.next;
            }   

            tmp.next = j.next;
            tmp.next.previous = tmp;
            tmp.previous = j;
            j.next = tmp;
        }
    }

    // Metodo de Inserir no Inicio
    public int removeStart() {
        CelulaDupla tmp = first.next;
        int numberRemoved = tmp.cell;

        first.next = tmp.next;

        tmp.next = tmp.previous = null;

        return numberRemoved;
    }

    // Metodo de Inserir no Final
    public int removeEnd() {
        int numberRemoved = last.cell;

        last = last.previous;
        last.next = null;

        return numberRemoved;
    }

    // Metodo para Remover em qualquer Posicao 
    public int remove(int position) throws Exception {
        int numberRemoved = -1;

        if(position < 0 || position > size()) {
            throw new Exception("Erro ao Inserir - Posicao Invalida"); // Verifica a posicao
        } else if (position == 0) {
            numberRemoved = removeStart();
        } else if (position == size()) {
            numberRemoved = removeEnd();
        } else {
            CelulaDupla tmp = first.next; 
            CelulaDupla j;

            for(int i = 0; i < position; i++) {
                tmp = tmp.next;
            }

            numberRemoved = tmp.cell;

            j = tmp.previous;
            j.next = tmp.next;
            tmp.next = tmp.previous = null;
        }

        return numberRemoved;
    }

    // Metodo para Retornar o Tamanho da Lista
    public int size() { 
        int counter = 0;

        for(CelulaDupla i = first.next; i != null; i = i.next) {
            counter++;
        }

        return counter;
    }

    // Metodo de Mostrar os Elementos
    public void show() {
        for(CelulaDupla i = first.next; i != null; i = i.next) {
            if(i != last) {
                System.out.print(i.cell + " - ");
            } else {
                System.out.println(i.cell);
            }
        }
    }

    // Metodo de Mostrar os Elementos de Tras para Frente
    public void showPrevious() {
        for(CelulaDupla i = last; i != first.next; i = i.previous) {
            if(i != first.next) {
                System.out.print(i.cell + " - ");
            } else {
                System.out.println(i.cell);
            }
        }
    }
}
