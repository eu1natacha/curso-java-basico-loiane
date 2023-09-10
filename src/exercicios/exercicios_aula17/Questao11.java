package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma=0;
        System.out.println("Informe um número:");
        int num1 = scan.nextInt();
        System.out.println("Informe outro número:");
        int num2 = scan.nextInt();

        System.out.println("Numeros no intervalo entre o 1º numero e o 2º: ");

        if (num1 <= num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
                soma = soma + i;
            }

        } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
                soma = soma + i;
            }
        }
        System.out.println("A soma é: " + soma);


    }
}

//Altere o programa anterior para mostrar no final a soma dos números.