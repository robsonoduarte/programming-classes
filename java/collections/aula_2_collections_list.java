package collections;


import java.util.ArrayList;
import java.util.List;

public class aula_2_collections_list {

    public static void main(String[] args) {

        // List
        // [ Julio | Marco | Robson ... ]
        //   0     | 1     | 2  ...

        List<Pessoa> pessoas = new ArrayList<>();
        // add ( adicionar )
        // get ( recuperar )

        Pessoa p1 = new Pessoa();
        p1.nome = "Julio";

        Pessoa p2 = new Pessoa();
        p2.nome = "Marco";

        Pessoa p3 = new Pessoa();
        p3.nome = "Robson";

        // metodo add
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        // metodo get
        System.out.println(pessoas.get(0).nome);
        System.out.println(pessoas.get(1).nome);
        System.out.println(pessoas.get(2).nome);

        //  Programa em Produção"
        //  Quantidade de Memória
        //  Máquina   - Sistema Operacional (SO)   - Programa    - Memória
        //  100mb     - 40mb                       - 60mb        - 100%
        //  100mb     - 40mb                       - 40mb        - 80%

        // list -> 20mb -40mb --> 1, 2, 3, 4, 4, 5.... 40mb ( out of memory )
    }


}
