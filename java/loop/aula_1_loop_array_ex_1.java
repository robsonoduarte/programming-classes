package loop;

public class aula_1_loop_array_ex_1 {
    public static void main(String[] args) {
        // * os valores são aleatorios

        // ex 1 - criar um array to tipo inteiro com tamanho de 5  e alterar os valores na posicao 3, 4

        // imprimir todos os valores dos arrays antes de depois das alteraçoes de valores

        int[] v9 = {1, 2, 3, 4 ,5};

        System.out.println(v9.length );

        System.out.println(v9[0]);
        System.out.println(v9[1]);
        System.out.println(v9[2]);
        System.out.println(v9[3]);
        System.out.println(v9[4]);

        v9[3] = 40;
        v9[4] = 30;

        System.out.println(v9[0]);
        System.out.println(v9[1]);
        System.out.println(v9[2]);
        System.out.println(v9[3]);
        System.out.println(v9[4]);

    }
}
