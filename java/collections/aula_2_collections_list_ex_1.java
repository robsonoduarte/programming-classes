package collections;



import java.util.ArrayList;
import java.util.List;

public class aula_2_collections_list_ex_1{

    public static void main(String[] args) {
        // declar uma lista do tipo pessoa
        // adicionar 3 pessoas utilizando o add
        // fazer o print do nome das 3 pessoas utilizando o get
        List<Pessoa> lista = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.nome = "Joao";
        p2.nome = "banana";
        p3.nome = "senna";
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        System.out.println(lista.get(0).nome);
        System.out.println(lista.get(1).nome);
        System.out.println(lista.get(2).nome);
    }

}
