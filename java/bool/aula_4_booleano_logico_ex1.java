package bool;

import java.util.Scanner;

public class aula_4_booleano_logico_ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n1 = Integer.parseInt(in.nextLine());
        System.out.println("Digite o segundo numero:");
        int n2 = Integer.parseInt(in.nextLine());

        // dado dois números verifica:
        // se n1 for maior que 10 e menor que 20 imprimir: "o número está entre 10 e 20"
        // se não imprimir: "o número não está entre 10 e 20"
        if ((n1 > 10) && ( n1 < 20)){
            System.out.println("o número está entre 10 e 20");
        }else{
            System.out.println("o número não está entre 10 e 20");
        }

        // se o n2 for menor que 0 ou maior que 20 imprimir: "o número é menor que 0 ou maior que 20"
        // se não imprimir: "o número está entre 0 e 20"
        if ( (n2 < 0) || (n2 > 20)){
            System.out.println("o número é menor que 0 ou maior que 20");
        }else{
            System.out.println("o número está entre 0 e 20");
        }

        // se o n2 for maior que n1 ou n2 igual a n1 imprima: "o n2 é maior ou igual a n1"
        // se não imprimir: "o n2 não é maior e nem igual a n1"
        if((n2 > n1) || (n2 == n1)){
            System.out.println("o n2 é maior ou igual a n1");
        }else{
            System.out.println("o n2 não é maior e nem igual a n1");
        }



    }
}
