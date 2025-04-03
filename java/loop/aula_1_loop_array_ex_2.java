package loop;

public class aula_1_loop_array_ex_2 {
    public static void main(String[] args) {
        // criar dois array (a1, a2) to tipo double com 4 posições com valores aleatórios
        // aplicar para cada posição do a1 um operação matemática com a a mesma posição do a2
        // e para o resultado de cada operação armazenar em um variavel
        // e criar um novo array a3 com as variaveis das operações

        double[] a1 = {20.0, 40.0, 30.0, 80.0};
        double[] a2 = {90.0, 30.0, 50.0, 70.0};

        double v1 = a1[0] + a2[0];
        double v2 = a1[1] - a2[1];
        double v3 = a1[2] * a2[2];
        double v4 = a1[3] / a2[3];

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

        double[] a3 = {v1, v2, v3, v4};

        // a3 = | v1  | V2 | v3   | v4  |
        // a3 = | 0   | 1  | 2    | 3   |
        // a3 = | 110 | 10 | 1500 | 1.4 |

        System.out.println(a3[0]);
        System.out.println(a3[1]);
        System.out.println(a3[2]);
        System.out.println(a3[3]);
    }
}





