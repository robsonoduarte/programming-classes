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


        for (int i = 0; i < h.size(); i++) {
            System.out.println(h.get(i));


        }

    }
}

