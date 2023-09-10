package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual produto você deseja comprar, por gentileza: ");
        String nomeProduto = scan.next();

        System.out.println( "Informe o 1º valor, por gentileza: ");
        double prod1 = scan.nextDouble();

        System.out.println( "Informe o 2º valor, por gentileza: ");
        double prod2 = scan.nextDouble();

        System.out.println( "Informe o 3º valor, por gentileza: ");
        double prod3 = scan.nextDouble();

        if (prod1 < prod2 && prod1 < prod3){
            System.out.println("O menor valor de " + nomeProduto + " é o primeiro: " + prod1);
        }else if (prod2 < prod1 && prod2 < prod3){
            System.out.println("O menor valor de " + nomeProduto + " é o segundo: " + prod2);
        }else if (prod3 < prod2 && prod3 < prod1){
            System.out.println("O menor valor de " + nomeProduto + " é o terceiro: " + prod3);
        }


    }
}
