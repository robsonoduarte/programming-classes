package variables;

import java.util.Scanner;

public class Licao4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a porcentagem de desempenho com gasolina aditivada:");
        double desempenho = Double.parseDouble(in.nextLine());
        System.out.println("Digite o total de km na cidade:");
        double KmTotalCidade = Double.parseDouble(in.nextLine());
        System.out.println("Digite o total de km na rodovia:");
        double KmTotalRodovia = Double.parseDouble(in.nextLine());
        System.out.println("Digite o valor da gasolina comum:");
        double gasolinaComum = Double.parseDouble(in.nextLine());
        System.out.println("Digite o valor da gasolina aditivada:");
        double gasolinaAditivada = Double.parseDouble(in.nextLine());
        System.out.println("Digite o km por litro na cidade com gasolina comum:");
        double kmPorLitroCidade = Double.parseDouble(in.nextLine());
        System.out.println("Digite o km por litro na rodovia com gasolina comum:");
        double KmPorLitroRodovia = Double.parseDouble(in.nextLine());

        double kmPorLitroCidadeAditivada = kmPorLitroCidade + (kmPorLitroCidade * (desempenho / 100.0));
        double kmPorLitroRodoviaAditivada = KmPorLitroRodovia + (KmPorLitroRodovia * (desempenho / 100.0));

        double totalLitrosCidadeComum = KmTotalCidade / kmPorLitroCidade ;
        double totalLitrosCidadeAditivada = KmTotalCidade / kmPorLitroCidadeAditivada;

        double totalLitrosRodoviaComum = KmTotalRodovia / KmPorLitroRodovia ;
        double totalLitrosRodoviaAditivada = KmTotalRodovia / kmPorLitroRodoviaAditivada ;

        System.out.println(" Com gasolina Comum na cidade ira gastar = " + totalLitrosCidadeComum * gasolinaComum);
        System.out.println(" Com gasolina Aditivada na cidade ira gastar = "  + totalLitrosCidadeAditivada * gasolinaAditivada);
        System.out.println(" Com gasolina Comum na rodovia ira gastar = " + totalLitrosRodoviaComum * gasolinaComum);
        System.out.println(" Com gasolina Aditivada na rodovia ira gastar = " + totalLitrosRodoviaAditivada * gasolinaAditivada);
    }
}
