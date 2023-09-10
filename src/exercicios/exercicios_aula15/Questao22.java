package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual fruta você deseja comprar? Digite morango ou maça: ");
        String tipoFruta = scan.nextLine();

        System.out.println("Informe quantos quilos você deseja: ");
        double quantidadeKg = scan.nextDouble();

        double valorPago = 0;


        if (tipoFruta.equalsIgnoreCase("MORANGO")) {
            if (quantidadeKg <= 5) {
                valorPago = quantidadeKg * 2.50;
            } else {
                valorPago = quantidadeKg * 2.20;
            }

        } else if (tipoFruta.equalsIgnoreCase("MAÇA")) {
            if (quantidadeKg <= 5) {
                valorPago = quantidadeKg * 1.80;
            } else {
                valorPago = quantidadeKg * 1.50;
            }

        } else {
            System.out.println("Fruta não encontrada! ");
            return;
        }

        if (quantidadeKg > 8){
            valorPago = valorPago - (valorPago * 0.10);
        }

        if (valorPago > 25 ){
            valorPago = valorPago - (valorPago * 0.10);
        }


        System.out.println("O valor da sua compra é: " + valorPago);


    }
}
