package exercicios.exercicios_aula17;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String usuario;
        String senha;

        do {
            System.out.println("Informe um nome de usuário: ");
            usuario = scan.next();
            System.out.println("Informe uma senha: ");
            senha = scan.next();

        } while (!validarSenha(usuario, senha));

        System.out.println("Cadastro concluido com sucesso!");

    }

    public static boolean validarSenha(String usuario, String senha){
        if (senha.equals(usuario)){
            System.out.println("Senha inválida, tente novamente.");
            return false;
        } else {
            return true;
        }
    }
}

//Faça um programa que leia um nome de usuário e a sua senha e não
//aceite a senha igual ao nome do usuário, mostrando uma mensagem
//de erro e voltando a pedir as informações.