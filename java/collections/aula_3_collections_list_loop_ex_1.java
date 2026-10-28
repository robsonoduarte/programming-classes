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


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        //contador | bool      |soma    // int i = 0; - > declarar o contador
        for (int i = 0; i < list.size(); i++) {   // while( i < h.size()) { -> expressão bool
            System.out.println(list.get(i));      // i++; -> somar o contador
        }

        // for (Tipo variável : arrayOuColecao) {
        //    // código a ser executado para cada elemento
        //

        //foreach
        for (int element : list) {
           if(element > 5){
                System.out.println(element);
            }
        }

    }
}

