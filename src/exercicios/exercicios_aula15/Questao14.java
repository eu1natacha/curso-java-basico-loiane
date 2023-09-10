package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a sua primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a sua segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        String conceito = "";
        boolean aprovacao = true;


        if (media >= 0 && media <= 4){
            conceito = "E";
            aprovacao = false;
        } else if (media > 4 && media <= 6) {
            conceito = "D";
            aprovacao = false;
        } else if (media > 6 && media <= 7.5) {
            conceito = "C";
        } else if (media > 7.5 && media <= 9) {
            conceito = "B";
        } else if (media > 9 && media <= 10) {
            conceito = "A";
        } else {
            conceito = "N/A";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

        if (aprovacao == true) {
            System.out.println("Você está aprovado! Com conceito: " + conceito);
        } else {
            System.out.println("Tente novamente no próximo ano! Seu conceito é: " + conceito);
        }


    }
}

