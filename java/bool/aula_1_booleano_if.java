package bool;

public class aula_1_booleano_if {
    public static void main(String[] args) {
        // tipo nome = valor;
        // declaracao de var to tipo boolean
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 2 == 2;
        boolean b4 = b1 != b2;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b3 == b2);

        // operadores de comparação

        // == equal to (igual a)
        System.out.println(1 == 2);
        System.out.println(2 == 1);
        System.out.println(2 == 2);

        // != not equal to (diferente de)
        System.out.println(1 != 1);
        System.out.println(1 != 2);

        // > greater than ( maior que )
        System.out.println(1 > 2);
        System.out.println(2 > 1);

        // < less than ( menor que )
        System.out.println( 1 < 2);
        System.out.println( 2 < 1);

        // >= greater than or equal to ( maior ou igual a )
        System.out.println(1 >= 1);
        System.out.println(23 >= 10);
        System.out.println(-1 >= -2); ///...2,1,0,-1,-2.....

        // <= less than or equal to ( menor ou igual a )
        System.out.println(-2 <= -1);
        System.out.println(-1 <= -1);
        System.out.println(0 <= -1);


        // estrutura de controle

        // if(boolean){expressão}
        // if(true){expressão é executada}
        // if(false){expressão não é executada}

        if (1 == 1) {
            System.out.println("entrou no primeiro if...");
        }
        if (1 == 2) {
            System.out.println("entrou no segundo if...");
        }
    }
}
