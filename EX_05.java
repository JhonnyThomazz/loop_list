package lista_de_exercícios;

import java.util.Scanner;

public class EX_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int somador = 0, num;

		for (int i = 1; i <= 10; i++) {
			System.out.println("informe um numero");
			num = scanner.nextInt();
			somador = somador + num;
		}
		System.out.println("");
		System.out.println(somador);
		scanner.close();

	}

}
