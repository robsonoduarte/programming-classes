package loop;

import java.util.Arrays;

public class aula_1_loop_array {

    public static void main(String[] args) {
        // tipo nome = valor;
        int v1 = 1;
        double v2 = 2.0;
        boolean v3 = false;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);



        // é uma variavel que pode conter varios valores
        // tipo [] = {v1, v2, v3, v4......};

        int[] v4 = {1, 2, 3, 4, 5};

        // visualizacao
        // fila = j | m | p | m .....
        //        1 | 2 | 3 | 4 .....

        // v4 =  1 | 2 | 3 | 4 |
        //       0 | 1 | 2 | 3


        System.out.println(v4[0]);
        System.out.println(v4[3]);
        System.out.println(v4[1]);

        int[] v5 = {12, 50, 125, 10, 11};
        System.out.println(v5[2]);
        System.out.println(v5[4]);

        double[] v6 = {2.0, 3.0, 4.0, 5.0, 6.0};
        System.out.println(v6[4]);

        boolean[] v7 = {true, false, false, true};
        System.out.println(v7[1]);
        System.out.println(v7[2]);


        // o array tem um tamanho que e a quantidade de elementos neleSystem.out.println(v4.
        System.out.println(v4.length);
        System.out.println(v5.length);
        System.out.println(v6.length);
        System.out.println(v7.length);


        // podemos alterar o valor da posicao do array
        v4[0] = 10;
        v4[1] = 20;
        v4[2] = 30;
        v4[3] = 40;
        v4[4] = 50;

        System.out.println(v4[3]);

        int[] v8 = {129, 50, 40, 30};
        System.out.println(v8[2]);
        v8[2] = 20;
        System.out.println(v8[2]);

        System.out.println(Arrays.toString(v4));
        System.out.println(Arrays.toString(v5));
        System.out.println(Arrays.toString(v6));
        System.out.println(Arrays.toString(v7));
        System.out.println(Arrays.toString(v8));
    }
}