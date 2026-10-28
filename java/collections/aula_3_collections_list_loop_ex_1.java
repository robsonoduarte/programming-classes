package collections;


import java.util.ArrayList;
import java.util.List;

public class aula_3_collections_list_loop_ex_1 {
    public static void main(String[] args) {

        // criar uma lista de inteiros
        // adicionar 5 elementos
        // fazer loop usando for tracional
        // fazer loop usando for each

        // 1. For Tradicional (com contador)
        // 2. For-Each (Enhanced For Loop)


        List<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(7);
        h.add(8);
        h.add(9);
        h.add(10);

        //contador | bool      |soma    // int i = 0; - > declarar o contador
        for (int i = 0; i < h.size(); i++) {   // while( i < h.size()) { -> expressão bool
            System.out.println(h.get(i));      // i++; -> somar o contador
        }

        // for (Tipo variável : arrayOuColecao) {
        //    // código a ser executado para cada elemento
        //

        //foreach
        for (int elemento : h) {
           if(elemento > 5){

                System.out.println(elemento);

            }

        }


    }
}

