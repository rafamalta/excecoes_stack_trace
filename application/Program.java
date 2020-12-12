package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		metodo1();
		System.out.println("Fim do programa");
	}

	public static void metodo1() {
		System.out.println("***INICIO METODO 1***");
		metodo2();
		System.out.println("***FIM METODO 1***");
	}

	public static void metodo2() {
		System.out.println("***INICIO METODO 2***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao invalida!");
			e.printStackTrace(); // não deixa "estourar" o programa, mostrando o erro de cada linha dos métodos
			sc.next();
		}
		
		catch (InputMismatchException e) {
			System.out.println("Erro de entrada");
		}
		
		sc.close();
		System.out.println("***FIM METODO 2***");
	}
}