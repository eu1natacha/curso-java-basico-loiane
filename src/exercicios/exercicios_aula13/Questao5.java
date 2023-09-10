package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "Digite sua altura em metros:");
        double alturaM = scan.nextDouble();

        double alturaCm = alturaM * 100;

        System.out.println("Sua altura em cm é: " + alturaCm);


    }
}
