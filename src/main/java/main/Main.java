package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Insira o primeiro n�mero:");
		int num1 = scanner.nextInt();
		System.out.print("Insira o segundo n�mero:");
		int num2 = scanner.nextInt();

		System.out.println("\nRESULTADO");
		System.out.println("O valor da soma �: " + somar(num1, num2));
		System.out.println("O valor da subtra��o �: " + subtrair(num1, num2));
		System.out.println("O valor da multiplica��o �: " + multiplicar(num1, num2));
		System.out.println("O valor da divis�o �: " + dividir(num1, num2));

		scanner.close();
	}

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}

}
