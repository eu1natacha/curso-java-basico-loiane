package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double popPaisA, popPaisB, taxaPaisA, taxaPaisB;

        System.out.println("Informe a quantidade da população do País A:");
        popPaisA = scan.nextDouble();

        System.out.println("Informe a taxa de crescimento da população do País A:");
        taxaPaisA = scan.nextDouble();

        System.out.println("Informe a quantidade da população do País B:");
        popPaisB = scan.nextDouble();

        System.out.println("Informe a quantidade da população do País B:");
        taxaPaisB = scan.nextDouble();

        System.out.println("O numero de anos necessarios para a população do " +
                "país A se igualar ou superar o país B é: " +
                calcularQtdAnosPaisASuperaPaisB(popPaisA, taxaPaisA, popPaisB, taxaPaisB));
    }

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

//Altere o programa anterior permitindo ao usuário informar as
//populações e as taxas de crescimento iniciais. Valide a entrada e
//permita repetir a operação.