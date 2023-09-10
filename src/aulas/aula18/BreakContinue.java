package aulas.aula18;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //BREAK
        System.out.println("Entre com um numero: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int max = scan.nextInt();

        for (int i=num ; i<=max ; i++){
            if (i % 7 == 0){
                System.out.println("O valor do primeiro numero " +
                                   "divisível por 7 é: " + i);
                break;
            }
        }

        //CONTINUE

        for (int i=num ; i<=max ; i++){
            if (i % 7 == 0) {
                continue;
            }
        System.out.println("Esse numero " +
                        "não é divisível por 7: " + i);
        }

    }
}
