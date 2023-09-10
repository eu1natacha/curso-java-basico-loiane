package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "Informe o 1º número, por gentileza: ");
        double num1 = scan.nextDouble();

        System.out.println( "Informe o 2º número, por gentileza: ");
        double num2 = scan.nextDouble();

        System.out.println( "Informe o 3º número, por gentileza: ");
        double num3 = scan.nextDouble();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("O maior número é: " + num1);
        }else if (num2 >= num1 && num2 >= num3){
            System.out.println("O maior número é: " + num2);
        }else if (num3 >= num2 && num3 >= num1){
            System.out.println("O maior número é: " + num3);
        }


    }
}

/*
OUTRA FORMA INTERESSANTE DE CRIAR UMA LÓGICA PARA ESSE PROGRAMA

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scan.nextInt();

        int maior;
        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);
    }
}
*/