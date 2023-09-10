package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7, por gentileza?");
        int numDiaSemana = scan.nextInt();
        String nomeDiaSemana = "Não é um dia da semana!";

        switch (numDiaSemana) {
            case 1 -> nomeDiaSemana = "Domingo!";
            case 2 -> nomeDiaSemana = "Segunda!";
            case 3 -> nomeDiaSemana = "Terça!";
            case 4 -> nomeDiaSemana = "Quarta!";
            case 5 -> nomeDiaSemana = "Quinta!";
            case 6 -> nomeDiaSemana = "Sexta!";
            case 7 -> nomeDiaSemana = "Sábado!";
        }
        System.out.println(nomeDiaSemana);
    }
}