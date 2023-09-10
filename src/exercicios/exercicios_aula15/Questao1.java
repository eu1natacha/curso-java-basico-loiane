package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o 1º número, por gentileza?");
        int num1 = scan.nextInt();

        System.out.println("Informe o 2º número, por gentileza?");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);

        } else if (num1 < num2){
            System.out.println("O maior número é: " + num2);

        } else {
            System.out.println("ATENÇÃO! Os números são iguais!");
        }
    }
}
