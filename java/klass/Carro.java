package klass;

public class Carro {
    int ano  ;
    int velocidade ;
    String modelo = "";
    boolean ligado ;
    String potencia ;

    void acelerar(){
      //  velocidade = velocidade+1;
        velocidade++;

    }
    void frear(){
  //  velocidade = velocidade - 1;
        velocidade--;
    }



   void desligar(){
        ligado=false;
   }
   void ligar(){
        ligado=true;
   }



    // o que é um método:
    // básicamente representa uma funcionalidade do contexto da nossa classe:
    // por exemplo
    // o Carro acelera, logo temos uma funcionalidde para acelear o carro
    // o Caro freira , log temos uma funcionalidade para freirar o carro.

    // sintaxe do metho
    // retorna ou não um valor
    // tem um mome
    // e pode ou não receber parametros

    // metodo
    // sintaxe: retorno nome () // parametros

    // void nome  ( double deposito )
    // void depositar(double deposito)

    // retorno to tipo double
    // nome: somar
    // recebe doi parametros
    // double somar ( double x, double y )

}


