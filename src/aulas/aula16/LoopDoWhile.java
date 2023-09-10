package aulas.aula16;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 1; // contador / count
        int max = 10;

        System.out.println("Contando até " + max);
        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // i = i+ 1; ou i +=1;
        }
        System.out.println("Valor adicional de i: " + i); // fora do looping é adicionado
        //  mais 1 e o i passa a ter o valor de 11
        do {
            i++;
            System.out.println("Valor de i:" + i);
        } while (i < 20);
        System.out.println(i);


    }
}
