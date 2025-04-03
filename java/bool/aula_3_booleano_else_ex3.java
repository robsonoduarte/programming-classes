package bool;

import java.util.Scanner;

public class aula_3_booleano_else_ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n1 = Integer.parseInt(in.nextLine());
        // operador modulo % retorna o "resto" da divisão

        // dado um numero ( n1 )
        // se ele for par imprima o número é par
        // caso contrario imprima o número é impar
        if( n1 % 2 == 0 ){
            System.out.println("o número é par");
        }else{
            System.out.println("o número é impar");
        }
    }
}
