package klass;

public class aula_5_class_method_ex_1 {
    public static void main(String[] args) {
        System.out.println("cadastro pessoa ");
        Cadastro c1 = new Cadastro();
        Pessoa p1 = c1.novo(49, "Robson Duarte");
        System.out.println(p1.idade);
        System.out.println(p1.nome);

        System.out.println("cadastro carro");
        Cadastro c2 = new Cadastro();
        Carro p2 = c2.novo( 2026, 1000 ,"potencia", "ferrari" );
        System.out.println(p2.ano);
        System.out.println(p2.velocidade);
        System.out.println(p2.modelo);
        System.out.println(p2.potencia);


        // criar um carro atraves do cadastro ( aqui )

    }
}
