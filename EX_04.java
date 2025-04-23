package lista_de_exercícios;

import java.util.Scanner;

public class EX_04 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("informe um nome:");
	String name = scanner.nextLine();
	
	for(int i = 1; i <=5; i++) {
		System.out.println(name);
		}scanner.close();
	
	}
}