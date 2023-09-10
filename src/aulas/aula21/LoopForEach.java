package aulas.aula21;

import java.util.Random;
import java.util.Scanner;

public class LoopForEach {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] notas = new int[10];

        Random random = new Random();

        for (int i=0 ; i < notas.length ; i++){
            notas[i] = random.nextInt(10);
        }

        for (int i=0 ; i<notas.length; i++){
            System.out.println(notas[i]);
        }

        System.out.println("Usando o FOR EACH");
        //sem acesso ao contador
        for (int nota: notas) {
            System.out.println(nota);
        }

    }
}
