package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número inicial: ");
        int numInicial = scan.nextInt();

        System.out.println("Informe o número final: ");
        int numFinal = scan.nextInt();

        imprimeNumerosHorizontal(numInicial,numFinal);
        System.out.println();
        imprimeNumerosVertical(numInicial,numFinal);

    }
    public static void imprimeNumerosVertical(int numInicial, int numFinal){

        for (int num = numInicial ; num <= numFinal ; num++){
            System.out.println(num);
        }
    }

    public static void imprimeNumerosHorizontal(int numInicial, int numFinal){

        for (int num = numInicial ; num <= numFinal ; num++){
            System.out.print(num + " ");
        }
    }


}

//Faça um programa que imprima na tela os números de 1 a 20, um
//abaixo do outro. Depois modifique o programa para que ele mostre os
//números um ao lado do outro.