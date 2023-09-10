package exercicios.exercicios_aula15;import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String resposta1 = scan.next();

        System.out.println("Esteve no local do crime?");
        String resposta2 = scan.next();

        System.out.println("Mora perto da vítima?");
        String resposta3 = scan.next();

        System.out.println("Devia para a vítima?");
        String resposta4 = scan.next();

        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = scan.next();

        int qtdSim = 0;

        if (resposta1.equalsIgnoreCase("sim")) {
            qtdSim++;
        }

        if (resposta2.equalsIgnoreCase("sim")) {
            qtdSim++;
        }

        if (resposta3.equalsIgnoreCase("sim")) {
            qtdSim++;
        }

        if (resposta4.equalsIgnoreCase("sim")) {
            qtdSim++;
        }

        if (resposta5.equalsIgnoreCase("sim")) {
            qtdSim++;
        }

        if (qtdSim == 2) {
            System.out.println("Resultado: Suspeito!");
        } else if (qtdSim == 3 || qtdSim == 4) {
            System.out.println("Resultado: Cumplice!");
        } else if (qtdSim == 5) {
            System.out.println("Resultado: ASSASSINO!");
        } else {
            System.out.println("Resultado: INOCENTE! ");
        }


        // 2 "sim" - suspeita / 3 e 4 cumplice / 5 assassino - caso contrario INOCENTE

       /* if (resposta1.equals("sim") && pergunta2.equals("sim") &&
           pergunta3.equals("sim") && pergunta4.equals("sim") &&
           pergunta5.equals("sim")){
            System.out.println("Resultado: ASSASSINO!");
        } if (resposta1.equals("sim") && pergunta2.equals("sim") &&
             pergunta3.equals("sim") && pergunta4.equals("sim")){
            System.out.println("Resultado: Cumplice!");
        } if (resposta1.equals("sim") && pergunta2.equals("sim") &&
             pergunta3.equals("sim")){
            System.out.println("Resultado: Cumplice!");
        } if (resposta1.equals("sim") && pergunta2.equals("sim")) {
            System.out.println("Resultado: Suspeito!");
        } else {
            System.out.println("Resultado: INOCENTE! ");
    }
*/

    }
}
