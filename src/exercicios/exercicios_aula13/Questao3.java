package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "Digite um número:");
        int numero1 = scan.nextInt();

        System.out.println( "Digite outro número:");
        int numero2 = scan.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("O resultado é: " + resultado);

    }
}
