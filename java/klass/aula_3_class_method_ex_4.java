package klass;

public class aula_3_class_method_ex_4 {
    public static void main(String[] args) {
        conta c1 = new  conta();
        c1.depositar(3.0);
        c1.depositar(2.0);
        c1.sacar(3.0);
        c1.sacar(3.0);
        c1.sacar(3.0);
        c1.sacar(5.0);
        c1.sacar(1.0);
        c1.sacar(1.0);
        c1.depositar(1.0);
        c1.depositar(1.0);
        //c1.sacar(1.0);
        //c1.sacar(7.0);
        System.out.println(c1.saldo);
        System.out.println(c1.limite);

    }
}
