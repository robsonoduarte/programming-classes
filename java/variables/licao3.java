package variables;

public class licao3 {
    public static void main(String[] args) {

        double  horasNoDia = 24.0;
        double minutosDoDia = 1440.0;
        double segundosDoDia = 86400.0;
        double diasDoAno = 365.25;
        double horasNoAno = diasDoAno * horasNoDia;
        double minutosNoAno = diasDoAno * minutosDoDia;
        double segundosNoAno = diasDoAno * segundosDoDia;
        System.out.println("Um ano tem = " + horasNoAno + " horas ");
        System.out.println("Um ano tem = " + minutosNoAno + " minutos ");
        System.out.println("Um ano tem = " + segundosNoAno + " segundos ");
    }
}
