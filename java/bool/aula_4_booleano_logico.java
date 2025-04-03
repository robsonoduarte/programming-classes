package bool;

public class aula_4_booleano_logico {
    public static void main(String[] args) {

        // operadores lógicos

        // || operador OR ( ou )
        // && operador E ( e )

        int x = 10;
        int y = 20;

        // TABELA && (E)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // TABELA || (OU)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // OPERADOR && (E)
                      // true      // true
        boolean b1 =  (x == 10) && (y == 20);

                      // true      // false
        boolean b2 =  (x == 10) && (y == 21);

                      // false     // true
        boolean b3 =  (x == 11) && (y == 20);

                      // false     //false
        boolean b4 =  (x == 11) && (y == 21);


        // OPERADOR || (OU)
                      // false     // true
        boolean b5 =  (x == 11) || (y == 20);

                      // true      // false
        boolean b6 =  (x == 10) || (y == 21);

                      // false     // false
        boolean b7 =  (x == 11) || (y == 21);

                      // true      // true
        boolean b8 =  (x == 10) || (y == 20);


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);


        if ((x == 11) && (y == 20)) {
            System.out.println("entrou no if");
        }else{
            System.out.println("entrou no else");
        }

    }
}
