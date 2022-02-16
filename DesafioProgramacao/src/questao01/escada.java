package questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class escada {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		System.out.print("Por favor, digite o numero de vezes: " );
		int qtdDegraus = input.nextInt();

		 
		for (int i = 0; i < qtdDegraus; i++) {
		degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
		}

		 

		for (String d : degraus ) {
			System.out.println(d);
		}

	}

}
