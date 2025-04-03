package loop;

public class aula_1_loop_array_ex_3 {
    public static void main(String[] args) {
        // criar um array de inteiro com 5 elementos ( 5 posições ) com valores aleatórios.
        // para cada posição calcular o seu quadrado ( potência de 2)  e atribuir cada resultado em uma variável
        // criar um novo array usando as variáveis do calculo.

        int[] a5 = {2, 4, 6, 8, 20};

        int q1 = a5[0] * a5[0];
        int q2 = a5[1] * a5[1];
        int q3 = a5[2] * a5[2];
        int q4 = a5[3] * a5[3];
        int q5 = a5[4] * a5[4];

        int[] alfa = {q1, q2, q3, q4, q5};

        int i = 0;
        while (i < alfa.length) {
            System.out.println(alfa[i]);
            i++;
        }
    }
}
