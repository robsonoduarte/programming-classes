package collections;


import java.util.ArrayList;
import java.util.List;

public class aula_3_collections_list_loop {
    public static void main(String[] args) {

        // revisar loop array
        // criar um array e fazer o loop usando for

        // | 1, 2, 3, 4, 5 | elementos
        // | 0, 1, 2, 3, 4 | posicoes
        double [] v2 = {1,2,3,4,5};
        int i = 0;
        while (i < v2.length){
            System.out.println(v2[i]);
            i = i + 1;
        }
        // como fazer loop em um lista
        // 1. For Tradicional (com contador)
        // 2. For-Each (Enhanced For Loop)
        // 3. Método forEach (com Expressão Lambda)

        // | 1, 2, 3, 4, 5 | elementos
        // | 0, 1, 2, 3, 4 | posicoes

        // tipo nome = atribuicao
        // lista de int g = do tipo array list
        List<Integer> g = new ArrayList<>();
        g.add(1);
        g.add(2);
        g.add(3);
        g.add(4);
        g.add(5);

        // 1. For Tradicional (com contador)
        for(i = 0; i < g.size(); i++){
            System.out.println(g.get(i));
        }
    }

}
