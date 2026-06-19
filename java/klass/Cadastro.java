package klass;

public class Cadastro {
    Pessoa novo(int idade, String nome){
       // tipo nome = atribuição
       Pessoa pessoa = new Pessoa(); // o new é um sintaxe especial do java...
       pessoa.idade = idade;
       pessoa.nome = nome;
       return pessoa;
    }
    Carro novo(int ano, int velocidade, String potencia,String modelo) {
        // tipo nome = atribuição carro carro = new carro();
        Carro c = new Carro();
        c.ano = ano;
        c.velocidade = velocidade;
        c.modelo = modelo;
        c.potencia = potencia;
        return c;
    }

    // desenvolver um metodo que retorna un Carro e que recebce como paramentros:
    // ano
    // velocidade
    // modelo
    // usar como exmplo o metodo novo acima...
}

