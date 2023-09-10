package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o grau em Farenheit, por gentileza:");

        double temperaturaFarenheit = scan.nextDouble();

        double temperaturaCelsius = 5 * (temperaturaFarenheit - 32) / 9;

        System.out.println("A temperatura em graus Celsius é:" + temperaturaCelsius);

    }
}
