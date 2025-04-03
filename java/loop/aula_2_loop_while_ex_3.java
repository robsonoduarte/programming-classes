package loop;

public class aula_2_loop_while_ex_3 {
    public static void main(String[] args) {
        // criar um array de inteiros com 5 elementos ( 5 posições ) com valores aleatórios.
        // para cada posição calcular o seu quadrado ( potência de 2) usando a estrutura de repetição while

        int[] potencias = {0, 0, 0, 0, 0};

        int[] a5 = {2, 4, 6, 8, 10};

        int i = 0;

        while (i < a5.length) {
            int q1 = a5[i] * a5[i];
            potencias[i] = q1;
            i = i + 1;
        }

        i = 0;

        while (i < potencias.length) {
            int q1 = potencias[i];
            System.out.println(q1);
            i = i + 1;
        }

    }
}
