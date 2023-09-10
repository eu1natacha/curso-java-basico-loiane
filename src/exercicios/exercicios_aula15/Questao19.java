package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro, por gentileza?");
        int numero1 = scan.nextInt();

        System.out.println("Informe um número inteiro, por gentileza?");
        int numero2 = scan.nextInt();

        double resultado = 0;

        System.out.println("Qual operação deseja realizar?");
        String operacao = scan.next();

        if (operacao.equals("/")) {
            resultado = numero1 / numero2;
        } else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operacao.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
        } else {
            System.out.println("Não é um valor de operação válido, insira +, -, / ou *");
        }


        if (resultado % 2 == 0) {
            System.out.println(resultado + " = é par!");
        } else {
            System.out.println(resultado + " = é ímpar!");
        }

        if (resultado >= 0){
            System.out.println(resultado + " = é positivo!");
        } else {
            System.out.println(resultado + " = é negativo!");
        }

    }
}
