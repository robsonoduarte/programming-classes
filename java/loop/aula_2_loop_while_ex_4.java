package loop;

public class aula_2_loop_while_ex_4 {
    public static void main(String[] args) {
        // criar um array do tipo inteiro com nome idades com 10 posições
        // calcular usando estrutura while
        // a idade media // criar uma variavel chamda idadeTotal
        // a soma de totas idades // criar uma variavel chamada totalIdades

        int[] idades = {12, 14, 43, 47, 48, 49};
        int i = 0;
        int idadeTotal = 0;
        while (i < idades.length) {
            idadeTotal = idadeTotal + idades[i];
            i++;

        }
        int idadeMedia = idadeTotal / idades.length;
        System.out.println(idadeMedia);
    }
}
