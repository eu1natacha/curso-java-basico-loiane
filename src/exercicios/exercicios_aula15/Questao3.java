package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu sexo usando F para feminino ou M para masculino, por gentileza?");
        char sexo = scan.next().toUpperCase().charAt(0);

        if (sexo == 'M'){
            System.out.println("Seu sexo é masculino!");

        } else if (sexo == 'F') {
            System.out.println("Seu sexo é feminino!");
        } else {
            System.out.println("404 error! Opa, ainda não temos esse sexo em nosso banco de dados!");
        }
    }
}
