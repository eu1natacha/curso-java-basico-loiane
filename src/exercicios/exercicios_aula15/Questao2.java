package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número, por gentileza?");
        int num1 = scan.nextInt();

        if (num1 >= 0) {
            System.out.println("O número é positivo! ");

        } else {
            System.out.println("O número é negativo!");
        }

    }
}
