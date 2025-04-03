package loop;

public class aula_2_loop_while_ex_2 {
    public static void main(String[] args) {
        //  criar um array com 10 elementos to tipo inteiro
        //  percorrer os elementos do array usando a estrutura de repetição while
        //  dentro o while verificar:
        // se o elemento do array é par -> imprmir "o elemento é par"
        // se o elemento do array é impar ->  imprmir "o elemento é impar"

        // LEMBRE-SE DA ESTRUTURA DE CONTROLE IF/ELSE
        // LEMBRE-SE DO OPERADOR MODULO %

        //{0, 1, 2, 3, 4, 5,  6, 7,  8,  9 }
        int[] a10 = {1, 3, 5, 7, 8, 9, 12, 14, 16, 19};
        int i = 0;
        while (i < a10.length) { // a10.length retorna o tamanh
            // o do array (10 )
            int z = a10[i];
            if (z % 2 == 0) {
                System.out.println(z + " é par");
            } else {
                System.out.println(z + " é impar");
            }
            i++; // i = i + 1
        }

        // 5 / 2 = 2 e resto 1
        // 4 / 2 = 2 e resto 0
        // 7 / 2 = 3 e resto 1
        // 8 / 2 = 4 e resto 0

    }

}
