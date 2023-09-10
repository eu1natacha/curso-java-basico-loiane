package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o tipo de combustível, sendo A- álcool e G- gasolina: ");
        String tipoCombustivel = scan.next().toUpperCase();

        System.out.println("Informe quantos litros deseja abastecer: ");
        double quantidadeLitros = scan.nextDouble();

        double valorAlcool = quantidadeLitros * 1.90;

        double valorGasolina = quantidadeLitros * 2.50;

        double valorPago = 0;


        if (tipoCombustivel.equalsIgnoreCase("A")) {
            if (quantidadeLitros <= 20) {
                valorPago = valorAlcool - (valorAlcool * 0.03);
            } else if (quantidadeLitros > 20) {
                valorPago = valorAlcool - (valorAlcool * 0.05);
            }

        }


        if (tipoCombustivel.equalsIgnoreCase("G")) {
            if (quantidadeLitros <= 20) {
                valorPago = valorGasolina - (valorGasolina * 0.04) ;
            } else if (quantidadeLitros > 20) {
                valorPago = valorGasolina - (valorGasolina * 0.06);
            }

        }

        System.out.println("O valor do seu abastecimento é: " + valorPago);

    }
}
