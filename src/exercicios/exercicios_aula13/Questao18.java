package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo em MB, por gentileza:");
        double arquivoMB = scan.nextDouble();

        System.out.println("Informe o tamanho do velocidade em Mbps, por gentileza:");
        double velocidadeMBPS = scan.nextDouble();

        double tempoDownload = arquivoMB / (velocidadeMBPS / 8);

        System.out.println("O tempo aproximado do download é: " + tempoDownload);

    }
}
