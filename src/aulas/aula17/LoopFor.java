package aulas.aula17;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

     /*   i = 0; i < 5
          i = 1; i <= 5
        for (int i=0; i < 5; i++){
            System.out.println("i tem valor de: " + i);
        }

        for (int i=5; i > 0; i--){
            System.out.println("i tem valor de: " + i);
        }

        for (int i=0, j=10; i < j; i++,j--) {
            System.out.println( "O valor de i é: " + i + "; O valor de j é: " + j);
        }

        //PARTES AUSENTES

        int count = 0;
        for ( ; count < 10 ; ){
            System.out.println("Valor de count: " + count);
            count += 2;
        }
        for (int cont=0; cont<10; cont+=2 ){
            System.out.println("Valor de cont: " + cont);
        }
*/
        //LOOP SEM CORPO

        int soma = 0;
        for (int i=1; i<5; soma += i++);
        System.out.println("O valor da soma: " + soma);
    }
}
