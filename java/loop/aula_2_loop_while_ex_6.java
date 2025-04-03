package loop;

public class aula_2_loop_while_ex_6 {
    public static void main(String[] args) {
        // escrever um programa utilizando a estrutura de repetição while para
        // obter o maior numero par do array

        // dicas:
        // criar uma variavel chamadas maior
        // usar a estrutura de condicional if dentro do while com o operador modulo

        int[] valores = {102, 49, 3, -1, 50, 2, 120, 66, 99, 100, -3, 99, 101, 51};
        int i = 0;
        int maiorPar =Integer.MIN_VALUE;
        int menorPar = Integer.MAX_VALUE;

        while (i < valores.length) {
            int x = valores[i];
            if (x % 2 == 0) {
                if (x > maiorPar) {
                    maiorPar = x;

                }
                if (x < menorPar) {
                    menorPar = x;
                }

            }
            i++;
        }
        System.out.println(maiorPar);
        System.out.println(menorPar);

    }
}
