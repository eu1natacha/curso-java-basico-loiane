package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de seu trabalho por hora, por gentileza:");
        double valorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês, por gentileza:");
        double horasMes = scan.nextDouble();

        double valorTotal = valorHora * horasMes;
        System.out.println("Você ganha um total de R$" + valorTotal + " por mês.");

    }
}
