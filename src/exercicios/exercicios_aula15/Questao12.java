package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas no mês, por gentileza: ");
        double horasTrabalhadas = scan.nextDouble();

        System.out.println("Informe o valor por hora trabalhada, por gentileza: ");
        double valorHora = scan.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHora;
        double percentualIR;

        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto >= 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto >= 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = inss + ir;
        double salarioLiquido = salarioBruto - totalDescontos;


        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto);
        System.out.println("Imposto de Renda: (-) " + percentualIR);
        System.out.println("FGTS: (11%) " + fgts);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salário Líquido: " + salarioLiquido);


    }
}
