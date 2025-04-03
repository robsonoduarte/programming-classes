package loop;

public class aula_2_loop_while_ex_1 {
    public static void main(String[] args) {
        // criar um array com 10 posições do tipo inteiro
        // imprimir os valores das 10 posições do array usando a estrutura de repetição while

        int[] a10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;
        while (i < a10.length) {
            System.out.println(a10[i]);
            i = i + 1;
        }

    }
}
