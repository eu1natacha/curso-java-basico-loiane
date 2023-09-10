package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, maiorNumero = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o número: ");
            num = scan.nextInt();

            if (maiorNumero < num) {
                maiorNumero = num;
            }
        }

        System.out.println("Dentre esses o maior número é: " + maiorNumero);

    }
}

//Faça um programa que leia 5 números e informe o maior número.
