package Estruturas_Flexiveis.java;

public class ListaEncadeada {
    private CelulaSimples first, last;

    public ListaEncadeada() {
        first = new CelulaSimples(); //  Celula de Incio (Cabecalho)
        last = first;
    }

    // Metodo de Inserir no Inicio
    public void insertStart(int x) {
        CelulaSimples cell = new CelulaSimples(x);

        if(first == last) {
            first.next = cell;
            last = first.next;
        } else {
            cell.next = first.next;
            first.next = cell;
        }
    }

    // Metodo de Inserir no Final
    public void insertEnd(int x) {
        last.next = new CelulaSimples(x);

        if(first == last) {
            first.next = last.next;
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
            CelulaSimples i = first.next;
            CelulaSimples tmp = new CelulaSimples(x);

            for(int j = 0; j < position; j++) {
                i = i.next;
            }

            tmp.next = i.next;
            i.next = tmp;
        }
    }

    // Metodo de Remover no Inicio
    public int removeStart() {
        CelulaSimples tmp = first.next;
        first.next = tmp.next;
        tmp.next = null;

        return tmp.cell;
    }

    // Metodo de Remover no Final
    public int removeEnd() {
        CelulaSimples i = first.next;
        int numberRemoved = last.cell;

        while(i.next != last) {
            i = i.next;
        }

        last = i;
        last.next = null;

        return numberRemoved;
    }

    // Metodo para Remover em qualquer Posicao 
    public int remove(int position) throws Exception {
        int numberRemoved = -1;

        if(position < 0 || position > size()) {
            throw new Exception("Erro ao Remover - Posicao Invalida"); // Verifica a posicao
        } else if (position == 0) {
            numberRemoved = removeStart();
        } else if (position == size()) {
            numberRemoved = removeEnd();
        } else {
            CelulaSimples i = first.next;
            CelulaSimples tmp;

            for(int j = 0; j < position - 1; j++) {
                i = i.next;
            }

            tmp = i.next;
            i.next = tmp.next;
            tmp.next = null;

            numberRemoved = tmp.cell;
        }
        
        return numberRemoved;
    }

    // Metodo para Retornar o Tamanho da Lista
    public int size() { 
        int counter = 0;

        for(CelulaSimples i = first.next; i != null; i = i.next) {
            counter++;
        }

        return counter;
    }

    // Metodo de Mostrar os Elementos
    public void show() {
        for(CelulaSimples i = first.next; i != null; i = i.next) {
            if(i != last) {
                System.out.print(i.cell + " - ");
            } else {
                System.out.println(i.cell);
            }
        }
    }
}
