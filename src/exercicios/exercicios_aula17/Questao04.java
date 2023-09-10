package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("O numero de anos necessarios para a população do " +
                "país A se igualar ou superar o país B é: " +
                calcularQtdAnosPaisASuperaPaisB(80000, 3,200000,1.5));
    }

    // 100 * 1 (* 100%) = 100
    // 100 * 0.03 = 3
    // 100 * 1.03 = 103

    public static int calcularQtdAnosPaisASuperaPaisB(double popPaisA, double taxaPaisA,
                                                      double popPaisB, double taxaPaisB){
        int anos;

        for (anos = 1; popPaisA <= popPaisB ; anos++){
            popPaisA = popPaisA + (popPaisA * taxaPaisA/100);
            popPaisB = popPaisB + (popPaisB * taxaPaisB/100);
        }

        return anos;
    }


}

//Supondo que a população de um país A seja da ordem de 80000
//habitantes com uma taxa anual de crescimento de 3% e que a
//população de B seja 200000 habitantes com uma taxa de crescimento
//de 1.5%. Faça um programa que calcule e escreva o número de anos
//necessários para que a população do país A ultrapasse ou iguale a
//população do país B, mantidas as taxas de crescimento.



