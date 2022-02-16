package questao02;

import java.util.Scanner;

public class senha {


	public static void main(String[] args) {
		int tamanhoSenha;
		Scanner input = new Scanner(System.in);

		System.out.print("Por favor, digite o seu nome: ");
        String username = input.next();
        
        
		do {
        	
        System.out.printf("Por favor, digite a sua senha: ");
        String senha = input.next();
        tamanhoSenha = contarLetras(senha);
        if (tamanhoSenha < 6) {
        	System.out.println("Para tornar sua senha segura adicione mais: " + (6 - tamanhoSenha) + " caracteres.");
        }
        } while (tamanhoSenha < 6);
		System.out.println("Parabens voce conseguiu realizar o cadastro.");

	}
	public static Integer contarLetras(String texto) {
	    return texto.length();
	}
}

