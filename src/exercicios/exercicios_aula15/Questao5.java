package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "Informe a 1ª nota: ");
        double nota1 = scan.nextDouble();

        System.out.println( "Informe a 2ª nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10){
            System.out.println("Sua média é: " + media + " - Aprovado, parabéns!");
        } else if (media <= 7){
            System.out.println("Sua média é: " + media + " - Reprovado!");
        } else if (media == 10){
            System.out.println("PARABÉNS!!! Sua média é: " + media + " - Aprovado com distinção!");
        }

    }
}
