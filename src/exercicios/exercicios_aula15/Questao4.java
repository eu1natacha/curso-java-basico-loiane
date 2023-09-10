package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma letra, por gentileza?");
        char letra = scan.next().toUpperCase().charAt(0);

        if (!Character.isLetter(letra)) {
            System.out.println("Não é uma letra válida!");
        } else {

            switch (letra) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("É uma vogal!");
                    break;
                default:
                    System.out.println("É uma consoante!");
            }
        }

    }
}
