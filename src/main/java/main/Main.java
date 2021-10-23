package main;

public class Main {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 2;

		System.out.println("O valor da soma é: " + somar(num1, num2));
		System.out.println("O valor da subtração é: " + subtrair(num1, num2));
		System.out.println("O valor da multiplicação é: " + multiplicar(num1, num2));
		System.out.println("O valor da divisão é: " + dividir(num1, num2));
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
