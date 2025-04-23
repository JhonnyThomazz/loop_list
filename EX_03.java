package lista_de_exercícios;

import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("informe seu nome: ");
		String nome = scanner.nextLine();
		int i = 1;
		
		while (i <=10) {
			System.out.println(nome);
		i++;
		}scanner.close();

	}

}
