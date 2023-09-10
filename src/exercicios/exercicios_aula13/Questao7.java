package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado, por gentileza:");

        double lado = scan.nextDouble();
        double area = Math.pow(lado , 2);
        System.out.println("O dobro do lado do quadrado é: " + 2 * area);

    }
}
