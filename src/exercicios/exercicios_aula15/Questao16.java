package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe o valor de A, por gentileza?");
        double valorA = scan.nextDouble();

        System.out.println("Informe o valor de B, por gentileza?");
        double valorB = scan.nextDouble();

        System.out.println("Informe o valor de C, por gentileza?");
        double valorC= scan.nextDouble();


        double valorDelta = Math.pow(valorB, 2) - 4 * valorA * valorC;

        double valorX1 = (-valorB + Math.sqrt(valorDelta))  / (2 * valorA);
        double valorX2 = (-valorB - Math.sqrt(valorDelta)) / (2 * valorA);


        if (valorA == 0) { // Se o valor A for zero, não é uma equação do segundo grau
            System.out.println("Não é uma equação do segundo grau!");
        } else { // Se o valor A não for zero, é uma equação do segundo grau
            if (valorDelta < 0) { // Se delta for negativo, não tem raízes
                System.out.println("A equação não possui raízes reais!");
            } else { // se o delta for positivo ou zero, tem raiz(es)
                if (valorDelta == 0) {
                    System.out.println("A equação possui apenas uma raiz real: " + valorX1);
                } else { // se o delta for diferente de zero e não for negativo
                    System.out.println("Delta: " + valorDelta);
                    System.out.println("A equação possui duas raízes: " + valorX1 + " e " + valorX2);
                }
            }
        }






    }
}
