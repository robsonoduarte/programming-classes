package klass;

public class aula_2_class_method_ex_1 {
    public static void main(String[] args) {
        // criar uma nova propriedade com o nome ligado do tipo booleano na classe Carro
        // criar dois movos metodos com os nomes ligar e desligar alterando o valor da variavel ligado
        // ligado  = true; ligar
        // ligado = falso; desligar
        int x = 20;
        Carro Carro = new Carro();



        Carro.ligar();
        System.out.println(Carro.ligado);
        // print da variavel ligado
        Carro.desligar();
        System.out.println(Carro.ligado);
        // print da variavel ligado
        Carro.acelerar();
    }

}
