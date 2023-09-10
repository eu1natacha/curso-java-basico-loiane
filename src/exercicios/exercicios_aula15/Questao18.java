package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro, por gentileza?");
        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println(numero + " = é par!");
        } else {
            System.out.println(numero + " = é ímpar!");
        }

    }
}
