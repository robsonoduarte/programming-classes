package klass;


public class aula_2_class_method {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // propriedades
        carro.modelo = "Fusca";
        carro.ano = 1976;
        carro.velocidade = 0;

        // metodos do carro
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.velocidade);
        carro.frear();
        System.out.println(carro.velocidade);

    }
}



// o que é uma classe ?
// de forma bem simples para essa aula:
// classe é uma forma de organizar o seu programa por  contexto/propriedades/funcionalidades
// contexto carro / pessoa
// ano / prop
// modelo / prop
// freiar / func
// acelerar / func



// contexto pessoa:
// nome // string
// idade // int
// andar
// falar


// sintaxe da classe;
/*
   class Nome {
     // propriedade
     // funcionalidade
   }
* */