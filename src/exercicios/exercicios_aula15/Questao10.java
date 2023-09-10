package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu turno usando M para matutino, V para vespertino ou N para noturno, por gentileza?");
        char turno = scan.next().toUpperCase().charAt(0);

        if (turno == 'M'){
            System.out.println("Bom dia!");

        } else if (turno == 'V') {
            System.out.println("Boa tarde!");

        } else if (turno == 'N') {
            System.out.println("Boa noite!");

        } else {
            System.out.println("Valor inválido!");
        }

    }
}
