package Lista.java;

public class Lista {
    private int[] list;
    private int size, counter;

    public Lista() {
        this(10);
    }

    public Lista(int x) {
        size = x;
        counter = 0;
        list = new int[size];
    }

    // Metodo de Inserir no Inicio (metodo nada eficiente)
    public void insertStart(int x) throws Exception {
        if(counter >= size){
           throw new Exception("Erro ao inserir - Tamanho");
        } 
  
        for(int i = counter; i > 0; i--){
           list[i] = list[i-1];
        }
  
        list[0] = x;
        counter++;
    }
    
    // Metodo de Inserir no Final
    public void insertEnd(int x) throws Exception {
        if(counter >= size) {
            throw new Exception("Erro ao Inserir - Tamanho");
        }

        list[counter++] = x;
    }

    // Metodo para Inserir em qualquer Posicao (metodo nada eficiente)
    public void insert(int x, int position) throws Exception {
        if(position < 0 || position >= size || position > counter) {
            throw new Exception("Erro ao Inserir - Posicao");
        } else if (position == 0) {
            insertStart(x);
        } else if (position == size - 1) {
            insertEnd(x);
        } else {
            for(int i = counter; i > position; i = i--) {
                list[i] = list[i-1];
            }
    
            list[position] = x;
            counter++;
        }
    }

    // Metodo de Remover no Inicio
    public int removeStart() {
        int numberRemoved = list[0];

        for(int i = 0; i <= counter; i = i++) {
            list[i] = list[i+1];
        }

        counter--;

        return numberRemoved;
    }

    // Metodo de Remover no Final
    public int removeEnd() {
        return list[counter--];
    }

    // Metodo para Remover em qualquer Posicao 
    public int remove(int x, int position) throws Exception  {
        int numberRemoved = -1;

        if(position < 0 || position > size) {
            throw new Exception("Erro ao Remover - Posicao Invalida"); // Verifica a posicao
        } else if (position == 0) {
            numberRemoved = removeStart();
        } else if (position == size) {
            numberRemoved = removeEnd();
        } else {
            numberRemoved = list[position];

            for(int i = position; i <= counter; i++) {
                list[i] = list[i+1];
            }
        }

        return numberRemoved;
    }

    // Retorna o Tamanho da Lista
    public int size() {
        return size;
    }

    // Metodo de Mostrar os Elementos
    public void show() {
        if(counter == size) {
            --counter; // caso a lista esteja cheia
        }

        for(int i = 0; i <= counter; i++) {
            if ((i + 1) != counter) {
                System.out.print(list[i] + " - ");
            } else {
                System.out.println(list[i]);
            }
        }
    }
}
