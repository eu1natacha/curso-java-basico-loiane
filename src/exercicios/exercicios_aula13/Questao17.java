package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o a área a ser pintada em m², por gentileza:");
        double areaPintada = scan.nextDouble();

        double coberturaLataTinta = 108;
        double coberturaGalaoTinta = 21.6;

        double precoLata = 80;
        double precoGalao = 25;

        double qtdSomenteLatas = Math.ceil(areaPintada / coberturaLataTinta) ;
        double precoSomenteLatas = qtdSomenteLatas * precoLata;
        System.out.println("Você paga um total de R$" + precoSomenteLatas +
                            " por " + qtdSomenteLatas + " lata(s) de tinta(s).");

        double qtdSomenteGaloes = Math.ceil(areaPintada / coberturaGalaoTinta) ;
        double precoSomenteGaloes = qtdSomenteGaloes * precoGalao;
        System.out.println("Você paga um total de R$" + precoSomenteGaloes +
                " por " + qtdSomenteGaloes + " galõe(s) de tinta(s).");

        double qtdLatas = Math.floor(areaPintada / coberturaLataTinta);
        double areaQueSobrou = areaPintada - (qtdLatas * coberturaLataTinta);
        double qtdGaloes = Math.ceil(areaQueSobrou / coberturaGalaoTinta);
        double precoTotalLatasEGaloes = (qtdLatas * precoLata) + (qtdGaloes * precoGalao);


        System.out.println("Comprando somente latas - você paga um total de R$" + precoSomenteLatas +
                " por " + qtdSomenteLatas + " lata(s) de tinta(s).");

        System.out.println("Comprando somente galões - você paga um total de R$" + precoSomenteGaloes +
                " por " + qtdSomenteGaloes + " galão(es) de tinta(s).");

        System.out.println("Comprando galões + latas - você paga um total de R$" + precoTotalLatasEGaloes +
                " por " + qtdLatas + " lata(s) de tinta(s)" + qtdGaloes + " galão(es) de tinta(s)");


    }
}