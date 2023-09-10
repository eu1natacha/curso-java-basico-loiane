package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdVezesParentesesFor, num, soma=0, qtdVezesDentroFor=0;


        for (qtdVezesParentesesFor = 1; qtdVezesParentesesFor <= 5; qtdVezesParentesesFor++) {
            System.out.println("Informe o número: ");
            num = scan.nextInt();
            soma += num;
            qtdVezesDentroFor++;
        }


        System.out.println("A soma desses numeros é:" + soma);

        System.out.println("A media desses numeros é:" + (soma / qtdVezesDentroFor));

    }
}

//Faça um programa que leia 5 números e informe a soma e a média
//dos números.