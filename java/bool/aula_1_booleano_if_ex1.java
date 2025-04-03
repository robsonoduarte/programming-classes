package bool;

import java.util.Scanner;

public class aula_1_booleano_if_ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n1 = Integer.parseInt(in.nextLine());
        System.out.println("Digite o segundo numero:");
        int n2 = Integer.parseInt(in.nextLine());


        if (n1 == n2) {
            System.out.println(n1 +  " == "  + n2);
        }
        if (n1 != n2) {
            System.out.println(n1 + " != " + n2);
        }
        if (n1 < n2) {
            System.out.println(n1 + " < " + n2);
        }
        if (n1 > n2) {
            System.out.println(n1 + " > " + n2);
        }
        if (n1 >= n2) {
            System.out.println(n1 + " >= " + n2);
        }
        if (n1 <= n2) {
            System.out.println(n1 + " <= " + n2);
        }

    }
}