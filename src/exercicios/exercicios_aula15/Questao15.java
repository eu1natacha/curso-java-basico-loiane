package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro lado, por gentileza?");
        int lado1 = scan.nextInt();

        System.out.println("Informe o segundo lado, por gentileza?");
        int lado2 = scan.nextInt();

        System.out.println("Informe o terceiro lado, por gentileza?");
        int lado3 = scan.nextInt();


        if (((lado1 + lado2) > lado3) || ((lado2 + lado3) > lado1) || ((lado1 + lado3) > lado2)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triâgulo Equilátero!");

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles!");

            } else {
                System.out.println("Triângulo Escaleno!");
            }
        } else {
            System.out.println("Não é um triângulo!");
        }


    }
}