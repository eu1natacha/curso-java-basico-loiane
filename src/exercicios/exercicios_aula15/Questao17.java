package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano, por gentileza?");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " = é ano bissexto!");
        } else {
            System.out.println(ano + " = não é ano bissexto!");
        }

    }
}
