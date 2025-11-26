package klass;

public class aula_3_class_method_ex_3 {
    public static void main(String[] args) {
        conta c1 = new  conta();
        c1.depositar(1.0);
        c1.depositar(1.0);
        System.out.println(c1.saldo);
        c1.sacar(1.0);
        c1.sacar(2.0);
        c1.sacar(1.0);
        System.out.println(c1.saldo);

    }
}
