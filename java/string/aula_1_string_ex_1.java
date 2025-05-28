package string;

public class aula_1_string_ex_1 {
    public static void main(String[] args) {
        // crie uma variavel do tipo string com valor do seu nome completo
        // aplicar o metodo toupper case
        // aplicar o metodo concat
        // aplicaro metodo tolowercase
        // atribuindo todos as chamadas a novas variaveis
        // fazer um encadeamento dos tres metodos a cima atribuindo uma nova variavel

        // int
        // double
        // bool
        // array


        String nome = "Julio Cesar Nunes Farias";
        String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();
        String nomeConcatenado = nome.concat(" filho ");
        String encadeamento = nome.toUpperCase().toLowerCase().concat(" filho ");
        String encadeamento2 = nome.toLowerCase().toUpperCase().concat(" filho2 ");
        String encadeamento3 = nome.toLowerCase().concat(" filho3 ").toUpperCase();

        System.out.println(nome);
        System.out.println(nomeMaiusculo);
        System.out.println(nomeMinusculo);
        System.out.println(nomeConcatenado);
        System.out.println(encadeamento);
        System.out.println(encadeamento2);
        System.out.println(encadeamento3);
    }




    // retorno mome(parametros)
    // String toUpperCase()
    // String concat(String)




}