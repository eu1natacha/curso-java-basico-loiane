package aulas.aula14;

import java.util.Scanner;

public class CondicionaisIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       /* System.out.println("Informe sua idade, por gentileza?");

        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade!");
        } else {
            System.out.println("Não é maior de idade!");
        }*/

        System.out.println("Informe o preço do item, por gentileza?");
        double valor = scan.nextDouble();
        
        if (valor <=10){
            System.out.println("Está barato demais!");
        } else if (valor > 10 && valor < 15){
            System.out.println("Você pode pedir um desconto!");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode Pesquisar mais!");
        } else { //valor >= 17
            System.out.println("Nossa, tá muito caro!");
        }

    }
}





