package questao03;

import java.util.Arrays;
import java.util.Scanner;

public class anagrama {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a palavra/frase:");
		String palavra = ent.next();
		int fat = 1;
		int valor = palavra.length();

		for (int i = 2; i <= valor; i++) {
			fat *= i;
		}
		System.out.println("é igual a " + fat);

	}
}
