package loop;

public class aula_2_loop_while {
    public static void main(String[] args) {
        // int[] a1 =    { 1, 2, 3, 4 }
                     //  | 1 | 2 | 3 | 4
                     //  | 0 | 1 | 2 | 3
                     // a1[0]
                     // a1[2]
                     // a1[3]...


        // while(boolean){
            // todas as instruções até que a condição boolean seja falsa
        // }

        int[] a1 = {1, 2, 3, 4, 5};

        int i = 0;
        while (i < a1.length) {
            System.out.println(a1[i]);
            i = i + 1;
        }
    }
}






