package klass;

public class aula_4_class_method_ex_5 {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        double soma = calc.soma(2.1, 2.3);
        System.out.println(soma);

        // chamar o subitrair
        // chamar o dividir
        // chamar o multiplicar
        double subt = calc.subt(2.1, 2.3);
        System.out.println(subt);

        double div = calc.div(2.1, 2.3);
        System.out.println(div);

        double mult = calc.mult(2.1, 2.3);
        System.out.println(mult);
     }
}

