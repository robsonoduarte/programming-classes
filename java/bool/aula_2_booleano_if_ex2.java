package bool;

import java.util.Scanner;

public class aula_2_booleano_if_ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o código da operação:");
        System.out.println("1 - Sacar:");
        System.out.println("2 - Depositar:");
        System.out.println("3 - Extrato:");
        int codigo = Integer.parseInt(in.nextLine());

        // revisão sintaxe declaração de variável
        // sintaxe => tipo nome = expressão
        // expressão => por somente um valor
        // expressão => por ser uma operação matemática


        // Aula 2 Boolean IF Ex2
        // escrever um programa que inicia com um saldo de 110.20 reais;
        // se o código for 1 imprima: Digite o valor do saque e aplique a operação no saldo
        // se o código for 2 imprima: Digite o valor do depósito e aplique a operação no saldo
        // se o código ofr 3 imprima: O Extrato é...

        // para próxima aula (13/03/24)
        // 1 - se o código for invalido imprima: O código não é valido  => ok
        // 2 - para o saque: se o saldo não for suficiente imprima: Saldo insuficiente ok
        // 3 - para o deposito: se o valor digitado for negativo imprima: Deposito não realizado valor está negativo

        // para próxima aula (20/03/24)
        // com a aula_3_booleano_else resolva os dois bugs que temos no nosso programa.

        double saldo = 110.20;
        if(codigo == 1) { // saque
            System.out.println("Digite o valor do saque:");
            double valor = Double.parseDouble(in.nextLine());
            if (valor > saldo) {
                System.out.println(" saldo insuficiente");
            }else{
                saldo = saldo - valor;
                System.out.println("O valor do saldo é " + saldo);
            }
        }
        if(codigo == 2){ // deposito
            System.out.println("Digite o valor do depósito:");
            double valor = Double.parseDouble(in.nextLine());
             //3,2,1,0,-1,-2,-3
            if (valor < 0){
                System.out.println("Deposito não realizado valor está negativo");
            }else{
                saldo = saldo + valor;
                System.out.println("O valor do saldo é " + saldo);
            }
        }
        if(codigo == 3){ // extrato
            // vamos fazer mais para frente... 20/03/24
        }
        if (codigo > 3){
            System.out.println("O código não é valido");
        }
    }
}
