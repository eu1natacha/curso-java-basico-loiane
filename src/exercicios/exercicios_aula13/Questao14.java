package exercicios.exercicios_aula13;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe o peso dos peixes que você pescou hoje: ");
        double kilos = scan.nextDouble();

        if (kilos >= 50) {
            double peixePescadoMulta = (kilos - 50) * 4;
            System.out.println("Você irá pagar R$ " + peixePescadoMulta);

        }else {
            System.out.println("Sua multa é R$ 0,0");
            }

        }

    }