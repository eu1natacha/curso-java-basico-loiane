package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "Informe o 1º número, por gentileza: ");
        double num1 = scan.nextDouble();

        System.out.println( "Informe o 2º número, por gentileza: ");
        double num2 = scan.nextDouble();

        System.out.println( "Informe o 3º número, por gentileza: ");
        double num3 = scan.nextDouble();

        //encontrar o maior numero
        if (num1 > num2 && num1 > num3){
            System.out.println("O maior número é: " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("O maior número é: " + num2);
        }else if (num3 > num2 && num3 > num1){
            System.out.println("O maior número é: " + num3);
        }

        //encontrar o menor numero
        if (num1 < num2 && num1 < num3){
            System.out.println("O menor número é: " + num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.println("O menor número é: " + num2);
        }else if (num3 < num2 && num3 < num1){
            System.out.println("O menor número é: " + num3);
        }

    }
}
