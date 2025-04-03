package bool;

public class aula_2_booleano_if {
    public static void main(String[] args) {
        boolean b = true;
        // operadores lógicos:
        // !logical not (negação /reverso)
          //  !b  = false
          //  !!b = true (dupla negação)
        // podemos ter varias instruções dentro de um if
        // e pode ter varios if dentro de if
        if (b) {
            System.out.println(b);
            System.out.println(!b);
            if (!b) {
                System.out.println(!b);
                System.out.println(!!b);
            }
        }
    }
}
