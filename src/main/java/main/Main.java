package main;

public class Main {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 2;

		System.out.println("O valor da soma �: " + somar(num1, num2));
		System.out.println("O valor da subtra��o �: " + subtrair(num1, num2));
		System.out.println("O valor da multiplica��o �: " + multiplicar(num1, num2));
		System.out.println("O valor da divis�o �: " + dividir(num1, num2));
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
