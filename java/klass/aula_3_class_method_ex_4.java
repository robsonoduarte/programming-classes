package klass;

public class aula_3_class_method_ex_4 {
    public static void main(String[] args) {
        conta c1 = new  conta();
        c1.depositar(10.0);
        c1.sacar(8.0);
        c1.sacar(10.0);
        c1.depositar(10.0);
        c1.depositar(2.0);
        System.out.println(c1.saldo);
        System.out.println(c1.limite);

    }
}
