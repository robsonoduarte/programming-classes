package klass;

public class aula_1_class {
    public static void main(String[] args) {


        // estamos criando um variavel do tipo carro chamda de c1
        // sintaxe:
        // nome_da_classe nome_da_variavel = new nome_da_classe();
        Carro c1 = new Carro();
        c1.modelo = "Fusca";
        c1.ano = 1975;

        System.out.println(c1.modelo);
        System.out.println(c1.ano);

        Carro c2 = new Carro();
        c2.modelo = "Pegout 2008";
        c2.ano = 2018;

        System.out.println(c2.modelo);
        System.out.println(c2.ano);

        // criar duas variaveis do tipo pessoa chamadas p1 e p2 e atribuir sua idade
        // e o seu nome e fazer o print das suas propriedades p1 e p2


        Pessoa p1 = new Pessoa();
        p1.idade = 12;
        p1.nome = "Marco";
        System.out.println(p1.idade);
        System.out.println(p1.nome);



        Pessoa p2= new Pessoa();
        p2.idade = 14;
        p2.nome = "Juio";
        System.out.println(p2.idade);
        System.out.println(p2.nome);


    }
}


// o que é uma classe ?
// de forma bem simples para essa aula:
// classe é uma forma de organizar o seu programa por  contexto/propriedades/funcionalidade
// contexto carro:
// freiar / func
// acelerar / func
// ano / prop
// modelo / prop

// contexto pessoa:
// andar
// falar
// nome
// idade


// sintaxe da classe;
/*
   class Nome {
     // propriedade
     // funcionalidade
   }
* */











