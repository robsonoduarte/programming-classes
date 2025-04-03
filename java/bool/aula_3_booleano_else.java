package bool;

public class aula_3_booleano_else {
    public static void main(String[] args) {

        // novo tipo de variável
        // o booleano pode ter somente dois valores:

        // true e false
        // temos operadores de comparação ( veja aula_1_booleano_if)
        // < ( menor que )

        // estrutura de controle
        // if(expressão) {
             // expr
             // epxr...
        // }

        // se a expressão for true
        // se a expressão for false


        // else é uma estrutura de controle
        // só pode ser utilizado depois e um if
        // TODA VEZ QUE O IF FOR FALSE SEMPRE O ELSE SERÁ EXECUTADO !!!!

        int i = 10;
        if(i < 0){
            System.out.println(" o i é menor que zero");
        }else{
            // infinitas intruções..
            System.out.println("o i é maior que zero");
        }
    }
}
