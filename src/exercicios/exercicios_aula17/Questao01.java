package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Informe uma nota de 0 a 10: ");
            nota = scan.nextInt();
        } while (!validarNota(nota));
    }

    public static boolean validarNota(int nota){
        if (nota >= 0 && nota <= 10){
            return true;
        } else {
            return false;
        }
    }




}
//Faça um programa que peça uma nota, entre zero e dez. Mostre uma
//mensagem caso o valor seja inválido e continue pedindo até que o
//usuário informe um valor válido.