package bool;

import java.util.Scanner;

public class aula_2_booleano_if_ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n1 = Integer.parseInt(in.nextLine());
        System.out.println("Digite o segundo numero:");
        int n2 = Integer.parseInt(in.nextLine());
        System.out.println("Digite o terceiro numero:");
        int n3 = Integer.parseInt(in.nextLine());

        // dado dois números
        // se n1 for maior que n2 e a soma dos dois números for < 20 imprima:
        // "n1 maior n2 e a soma e menor que 20" usando dois if encadeados
        if (n1 > n2) {
            int s = n1 + n2;
            if (s < 20) {
                System.out.println("n1 maior n2 e a soma e menor que 20");
            }
        }

        // dados dois números
        // se a soma dos dois números for > 20 verificar se n1 < n2, caso verdadeiro imprima:
        // "a soma dos dois números é maior que 20 e n1 < n2
        int d = n1 + n2;
        if ( d > 20 ){
            if( n1 < n2){
                System.out.println("a soma dos dois números é maior que 20 e n1 < n2");
            }
        }

        // dados dois números
        // se a multiplicação for >= 10 verificar se n1 < n2 usando o operador de negação, caso verdadeiro imprima:
        // "a multiplicação dos dois números é maior que 10 e n1 < n2"
        int l = n1 * n2;
        if ( l >= 10 ){
            boolean k = n1 > n2;
            if (!k){
                System.out.println("a multiplicação dos dois números é maior que 10 e n1 < n2");
            }
        }

        // dados três números
        // se a multiplicação de n1 * n2 for > 10, verificar:
        // n1 > n3, se verdadeiro: "imprimir n1 > n3"
        // n2 < n3, se verdadeiro: "imprimir n2 < n3"
        int g = n1 * n2;
        if( g > 10 ){
            if(n1 > n3){
                System.out.println("n1 > n3");
            }
            if(n2 < n3){
                System.out.println("n2 < n3");
            }
        }
    }
}
