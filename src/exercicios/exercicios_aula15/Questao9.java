package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

// SUGESTÃO DA INTERNET
           System.out.println("Digite o primeiro número: ");
                int num1 = scan.nextInt();

                System.out.println("Digite o segundo número: ");
                int num2 = scan.nextInt();

                System.out.println("Digite o terceiro número: ");
                int num3 = scan.nextInt();

                if (num1 >= num2 && num1 >= num3) {
                    if (num2 >= num3) {
                        System.out.println(num1 + " " + num2 + " " + num3);
                    } else {
                        System.out.println(num1 + " " + num3 + " " + num2);
                    }
                } else if (num2 >= num1 && num2 >= num3) {
                    if (num1 >= num3) {
                        System.out.println(num2 + " " + num1 + " " + num3);
                    } else {
                        System.out.println(num2 + " " + num3 + " " + num1);
                    }
                } else if (num3 >= num1 && num3 >= num2) {
                    if (num1 >= num2) {
                        System.out.println(num3 + " " + num1 + " " + num2);
                    } else {
                        System.out.println(num3 + " " + num2 + " " + num1);
                    }
                }

    }
}

// MEU CÓDIGO ~ ERRADO!
/*
System.out.println( "Informe o 1º número, por gentileza: ");
        double num1 = scan.nextDouble();

        System.out.println( "Informe o 2º número, por gentileza: ");
        double num2 = scan.nextDouble();

        System.out.println( "Informe o 3º número, por gentileza: ");
        double num3 = scan.nextDouble();

        if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
            System.out.println("Ordem decrescente: " + num1 + ", " + num2 + ", " + num3 + ".");
        }else {
            System.out.println("Ordem decrescente: " + num1 + ", " + num3 + ", " + num2 + ".");
        }


        if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
            System.out.println("Ordem decrescente: " + num2 + ", " + num1 + ", " + num3 + ".");
        }else {
            System.out.println("Ordem decrescente: " + num2 + ", " + num3 + ", " + num1 + ".");


        if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
            System.out.println("Ordem decrescente: " + num3 + ", " + num1 + ", " + num2 + ".");
        } else {
            System.out.println("Ordem decrescente: " + num3 + ", " + num2 + ", " + num1 + ".");

            }
        }


    }
}



/*
 */