package loop;

public class aula_2_loop_while_ex_5 {
    public static void main(String[] args) {
        // escrever um programa utilizando a estrutura de repetição while para
        // obter o menor e maior valor do seguinte array:

        // dicas:
        // criar duas variaveis chamadas menor e maior
        // usar a estrutura de condicional if dentro do while para obter o menor e maior número do array

        int[] valores = {49, 3, -1, 50, 2, 66, 99, 100, -3, 99, 101, 51};
        int i = 0;
        int maior = 0;
        int menor = 0;

        while (i < valores.length) {
            int x = valores[i];
            if (x > maior) {
                maior = x;
            }
            if (x < menor) {
                menor = x;
            }
            i++;
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}
