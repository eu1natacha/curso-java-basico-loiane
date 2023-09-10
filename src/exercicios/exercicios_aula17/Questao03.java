package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do{
            System.out.println("Informe seu nome: ");
            nome = scan.next();
        } while (!validarNome(nome));

        do{
            System.out.println("Informe sua idade: ");
            idade = scan.nextInt();
        } while (!validarIdade(idade));

        do{
            System.out.println("Informe seu salario: ");
            salario = scan.nextDouble();
        } while (!validarSalario(salario));

        do{
            System.out.println("Informe seu Sexo: F - Feminino ou M - Masculino: ");
            sexo = scan.next();
        } while (!validarSexo(sexo));

        do{
            System.out.println("Informe seu estado civil: ");
            estadoCivil = scan.next();
        } while (!validarEstadoCivil(estadoCivil));


    }

    public static boolean validarNome(String nome){
        if (nome.length() > 3){
            return true;
        } else {
            System.out.println("Por favor, insira mais que 3 caracteres no nome.");
            return false;
        }
    }

    public static boolean validarIdade(int idade){
        if (idade > 0 && idade < 150){
            return true;
        } else {
            System.out.println("Por favor, insira uma idade real.");
            return false;
        }
    }

    public static boolean validarSalario(double salario){
        if (salario > 0){
            return true;
        } else {
            System.out.println("Por favor, insira um valor maior que zero.");
            return false;
        }
    }

    public static boolean validarSexo(String sexo){
        if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
            return true;
        } else {
            System.out.println("Sexo inválido! Por favor, insira F ou M.");
            return false;
        }
    }

    public static boolean validarEstadoCivil(String estadoCivil){
        if (estadoCivil.equalsIgnoreCase("S") ||
                estadoCivil.equalsIgnoreCase("C") ||
                        estadoCivil.equalsIgnoreCase("V") ||
                                estadoCivil.equalsIgnoreCase("D")){
            return true;
        } else {
            System.out.println("Estado civil inválido! Por favor, insira S, C, V ou D.");
            return false;
        }
    }

}

//Faça um programa que leia e valide as seguintes informações:
//a. Nome: maior que 3 caracteres;
//b. Idade: entre 0 e 150;
//c. Salário: maior que zero;
//d. Sexo: 'f' ou 'm';
//e. Estado Civil: 's', 'c', 'v', 'd';