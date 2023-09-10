package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura, por gentileza:");
        double altura = scan.nextDouble();

        System.out.println("Informe seu sexo, sendo 'M' para mulher e 'H' para homem: ");
        String sexo = scan.next();

        double pesoIdeal;
        if (sexo.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        System.out.println("O peso ideal é: " + pesoIdeal);

        System.out.println("Digite o peso atual em kg: ");
        double pesoAtual = scan.nextDouble();

        if (pesoAtual == pesoIdeal) {
            System.out.println("Você está no peso ideal.");
        } else if (pesoAtual < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else {
            System.out.println("Você está acima do peso ideal.");
        }


    }
}