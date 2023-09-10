package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura, por gentileza:");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) -58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);

    }
}
