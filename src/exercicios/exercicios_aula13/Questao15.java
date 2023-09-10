package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de seu trabalho por hora, por gentileza:");
        double valorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês, por gentileza:");
        double horasMes = scan.nextDouble();

        double valorBruto = valorHora * horasMes;
        System.out.println("Você ganha um total de R$" + valorBruto + " bruto.");

        double calculoIr = 11.0 * valorBruto;
        double resultadoIr = calculoIr / 100;
        System.out.println("Você paga um total de R$" + resultadoIr + " de imposto de renda.");

        double calculoINSS = 8 * valorBruto;
        double resultadoINSS = calculoINSS / 100;
        System.out.println("Você paga um total de R$" + resultadoINSS + " ao INSS.");

        double calculoSindicato = 5 * valorBruto;
        double resultadoSindicato = calculoSindicato / 100;
        System.out.println("Você paga um total de R$" + resultadoSindicato + " de sindicato.");

        double totalDescontos = resultadoINSS + resultadoSindicato + resultadoIr;
        System.out.println("Desconto total: " + totalDescontos );

        double descontos = resultadoIr + resultadoINSS + resultadoSindicato;
        double salarioLiquido = valorBruto - descontos;
        System.out.println("O valor líquido de seu salário é R$" + salarioLiquido);
        }
}
