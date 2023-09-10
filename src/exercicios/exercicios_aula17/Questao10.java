package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe um número:");
        int num1 = scan.nextInt();
        System.out.println("Informe outro número:");
        int num2 = scan.nextInt();

        System.out.println("Numeros no intervalor entre o 1º numero e o 2º: ");

        if (num1 <= num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);

            }

        } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);

            }
        }

    }
}


//Faça um programa que receba dois números inteiros e gere os
//números inteiros que estão no intervalo compreendido por eles.