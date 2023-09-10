package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio do círculo, por gentileza:");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio , 2);
        System.out.println("Sua área é: " + area);
    }

}
