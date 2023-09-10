package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tipo de carne você deseja comprar? Digite File duplo, alcatra ou picanha: ");
        String tipoCarne = scan.nextLine();

        System.out.println("Informe quantos quilos você deseja: ");
        double qtdKg = scan.nextDouble();

        System.out.println("Vai pagar com cartão Tabajara? Digite 'S' para Sim ou 'N' para Não: ");
        String descontoCartao = scan.next();


        double valorPago = 0;


        if (tipoCarne.equalsIgnoreCase("File Duplo")) {
            if (qtdKg <= 5) {
                valorPago = qtdKg * 4.90;
            } else {
                valorPago = qtdKg * 5.80;
            }
        } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
            if (qtdKg <= 5) {
                valorPago = qtdKg * 5.90;
            } else {
                valorPago = qtdKg * 6.80;
            }
        }else if (tipoCarne.equalsIgnoreCase("Picanha")) {
            if (qtdKg <= 5) {
                valorPago = qtdKg * 6.90;
            } else {
                valorPago = qtdKg * 7.80;
            }
        } else {
            System.out.println("Tipo de carne não encontrado, tente novamente!");
            return;
        }

        if (descontoCartao.equalsIgnoreCase("S")){
            valorPago = valorPago - (valorPago * 0.05);
        }

        System.out.println("Nota Fiscal: ");
        System.out.println("Tipo de Carne: " + tipoCarne);
        System.out.println("Quilogramas: " + qtdKg);
        System.out.println("Valor total: R$ " + valorPago);

    }
}
