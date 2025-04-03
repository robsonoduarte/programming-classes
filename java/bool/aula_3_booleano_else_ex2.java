package bool;

import java.util.Scanner;

public class aula_3_booleano_else_ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n1 = Integer.parseInt(in.nextLine());
        System.out.println("Digite o segundo numero:");
        int n2 = Integer.parseInt(in.nextLine());
        System.out.println("Digite o terceiro numero:");
        int n3 = Integer.parseInt(in.nextLine());

        // dados 3 números:
        // multiplicar os dois primeiros e depois somar o terceiro e armazenar o resultado em um variável do tipo double
        // se o resultado for menor que 100, dividir o resultado por 2 e imprimir a divisão
        // se o resultado for igual a 100, somar o resultado por 10 e imprimir a soma
        // caso contrario subtrair o resultado por 3.17 e imprimir a subtração

        double  resultado = n1 * n2 + n3;
        if (  resultado < 100 ){
            double divisao = resultado / 2;
            System.out.println( divisao );
        }
        if ( resultado == 100 ){
            double soma = resultado + 10;
            System.out.println( soma );
        }else{
            double subtracao = resultado - 3.17;
            System.out.println( subtracao );
        }
    }
}
