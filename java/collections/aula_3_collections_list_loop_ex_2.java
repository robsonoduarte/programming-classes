package collections;


import java.util.ArrayList;
import java.util.List;

public class aula_3_collections_list_loop_ex_2 {
    public static void main(String[] args) {

        // criar uma lista de Pessoas
        // adicionar 10 pessoas
        // fazer loop usando for each
        // pintar somente as pessoas 18+ ( maiores de idade) // dica printar o elmento do foreach
        List<Pessoa> list = new ArrayList<>();
        Pessoa p1 = new Pessoa();
        p1.idade = 13;
        list.add(p1);

        Pessoa p2 = new Pessoa();
        p2.idade = 15;
        list.add(p2);
        
        Pessoa p3 = new Pessoa();
        p3.idade = 17;
        list.add(p3);

        Pessoa p4 = new Pessoa();
        p4.idade = 20;
        list.add(p4);

        for (Pessoa p : list) {
            if ( p.idade  > 18) {
                System.out.println(p.idade);
            }

        }
    }

}