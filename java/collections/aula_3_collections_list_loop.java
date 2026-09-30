package collections;


import java.util.ArrayList;
import java.util.List;

public class aula_3_collections_list_loop {
    public static void main(String[] args) {

        // revisar loop array
        // criar um array e fazer o loop usando for

        double [] v2 = {1,2,3,4,5};
        int i = 0;
        while (i < v2.length){
            //i++;
            System.out.println(v2[i]);
            i = i + 1;

        }

        // como fazer loop em um lista
        // foreach loop
        // foreach loop metodo
        List<Integer> g = new ArrayList<>();
        g.add(1);
        g.add(2);
        g.add(3);
        g.add(4);
        g.add(5);



    }

}
