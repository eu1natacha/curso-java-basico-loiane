package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o a área a ser pintada em m², por gentileza:");
        double areaPintada = scan.nextDouble();

        double coberturaLataTinta = 54;
        double precoLata = 80;

        double latasNecessarias = Math.ceil(areaPintada / coberturaLataTinta);

        double precoTotal = latasNecessarias * precoLata;

        System.out.println("Você paga um total de R$" + precoTotal + " por " + latasNecessarias + " lata(s) de tinta(s).");

    }
}
