package bool;

import java.util.Scanner;

public class aula_3_booleano_else_ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n1 = Integer.parseInt(in.nextLine());
        System.out.println("Digite o segundo numero:");
        int n2 = Integer.parseInt(in.nextLine());

        // ex 1.1
        // se a soma dos dois números for maior que 10. Multiplique a soma por 10 é imprima o resultado
        // caso contrario divida a soma por dois e imprima o resultado
        /// usando a estrutura if/else

        // ex 1.2
        // se a multiplicação for menor que 200 imprima: valor menor que duzentos
        // caso contrario imprima só o valor da multiplicação
        // se a divisão for maior ou igual 100 imprima: a divisão é maior ou igual a 100
        // caso contrario imprima só a divisão
        // usando a estrutura if/else


        // if/else
        //if(condicao){
        // }else{
        // }

        double soma = n1 + n2;
        if (soma > 10) {
            double multiplicacao = soma * 10;
            if ( multiplicacao < 200 ){
                System.out.println(" valor menor que duzentos " );
            }else{
                System.out.println( multiplicacao );
            }
        }else {
            double divisao = soma /  2;
            if ( divisao >= 100 ){
                System.out.println(" a divisão é maior ou igual a 100");
            }else{
                System.out.println( divisao );
            }
        }
    }
}
