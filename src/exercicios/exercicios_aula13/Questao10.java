package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o grau em Celsius, por gentileza:");

        double temperaturaCelsius = scan.nextDouble();

        double temperaturaFarenheit = 1.8 * temperaturaCelsius + 32;

        System.out.println("A temperatura em graus Farenheit é:" + temperaturaFarenheit);
    }
}
