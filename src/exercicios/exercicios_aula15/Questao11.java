package exercicios.exercicios_aula15;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


// minha linha de raciocinio
        System.out.println("Informe o seu salário, por gentileza: ");
        double salarioAtual = scan.nextDouble();

        double novoSalario;
        double percentualSalario;
        double aumento;

        if (salarioAtual <= 280) {
            novoSalario = salarioAtual * 0.2 + salarioAtual;
        } else if (salarioAtual >= 280 && salarioAtual <= 700) {
            novoSalario = salarioAtual * 0.15 + salarioAtual;
        } else if (salarioAtual >= 700 && salarioAtual <= 1500) {
            novoSalario = salarioAtual * 0.1 + salarioAtual;
        } else {
            novoSalario = salarioAtual * 0.05 + salarioAtual;
        }

        aumento = novoSalario - salarioAtual;
        percentualSalario = aumento / salarioAtual;

        System.out.println("Salário antes do reajuste: " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualSalario + " %");
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário: " + novoSalario);

    }

}

//sugestao do ChatGPT rs a Loiane fez assim também

       /* System.out.println("Informe o seu salário, por gentileza: ");
        double salarioAtual = scan.nextDouble();
        double percentualAumento;
        double novoSalario;
        double aumento;

        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700) {
            percentualAumento = 20;
        } else if (salarioAtual <= 1500){
            percentualAumento = 20;
        } else{
            percentualAumento = 5;
        }

        aumento = salarioAtual * percentualAumento / 100;
        novoSalario = salarioAtual + aumento;

        System.out.println("Salário antes do reajuste: " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + " %");
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário: " + novoSalario);


    }
}*/