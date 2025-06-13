package string;

public class aula_1_string {
    public static void main(String[] args) {



        // var revisão
        // variavéis de tipo primitivo
        int i = 1;
        double d = 2.0;
        boolean b = true;




        // String é uma variavél especial por é uma classe !!
        String s = "oi eu sou uma string";


        // e E -> deixa tudo em maiusculo
        System.out.println(s.toUpperCase());

        // concatenação ->  "ou eu sou uma string " + "ou sou uma outra string sendo concatenada"
        System.out.println(s.concat("ou sou uma outra string sendo concatenada"));

        // chamadas encadeadas de metodos
        // toUpperCase() -> String
        // contact(String) -> String
        System.out.println(s.toUpperCase().concat(" eu sou outra string"));
        System.out.println(s.toUpperCase().concat(" eu sou outra string").toLowerCase());


        String s1 = s.toUpperCase();
        String s2 = s.toUpperCase().concat(" eu sou outra string");
        String s3 = s.toUpperCase().concat(" eu sou outra string").toLowerCase();


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);





        
    }
}
