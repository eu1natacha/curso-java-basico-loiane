package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 1 número inteiro, por gentileza:");
        int numero1 = scan.nextInt();

        System.out.println("Informe 1 outro número inteiro, por gentileza:");
        int numero2 = scan.nextInt();

        System.out.println("Agora informe 1 número real, por gentileza:");
        double numero3 = scan.nextDouble();

        int resultado1 = (2 * numero1) + (numero2 / 2);

        double resultado2 = (3 * numero1) + numero3;

        double resultado3 = Math.pow(numero3, 3);

        System.out.println("O produto do dobro do primeiro numero inteiro com metade do segundo numero e: " + resultado1);

        System.out.println("A soma do triplo do primeiro numero inteiro com o terceiro numero: " + resultado2);

        System.out.println("O numero real elevado ao cubo e: " + resultado3);


    }
}
