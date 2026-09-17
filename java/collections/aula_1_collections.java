package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aula_1_collections {
    public static void main(String[] args) {
        // [ 10 | 12 | 13 | 14 | 15 ]  // 5
        //   0  |  1 |  2 | 3  | 4     // 0
        int[] x = {10 , 12, 13, 14, 15};
        System.out.println(x[0]);
        System.out.println(x[4]);

        // List
        // Map

        // List
        // [1, 2, 3, 4, 5...]
        // [Carro, Carro, Carro, Carro...]
        // [Pessoa, Carro, Aminal...] //


        List<Pessoa> list = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        p1.nome = "Julio";

        Pessoa p2 = new Pessoa();
        p2.nome = "Marco";

        list.add(p1);
        list.add(p2);

        list.forEach(pessoa -> System.out.println(pessoa.nome));

        // Map
        // chave/valor
        // {[1, Pessoa], [2, Pessoa], [3, Pessoa]....}

        Map<Integer, Pessoa> map = new HashMap<>();
        map.put(1, p1);
        map.put(2, p2);

        System.out.println(map.get(1).nome);
        System.out.println(map.get(2).nome);
    }

}
