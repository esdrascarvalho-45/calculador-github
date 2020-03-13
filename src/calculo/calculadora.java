package calculo;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// calculadora com os operadores + , -, x e /.
		System.out.println("Digite um operador a soma + , - , x ou /");
		String operador = scan.nextLine();
		// opção de escolha conforme os operadores disponiveis.
		switch (operador) {

		// operador de soma.
		case "+":
			System.out.println("digite um número a somar:");
			double numero = scan.nextDouble();

			System.out.println("digite outro número:");
			double nume = scan.nextDouble();
			// soma dos valores.
			double soma = numero + nume;

			System.out.println("soma:" + soma);
			break;
		// operador de subtração.
		case "-":
			System.out.println("digite um número a subtrair:");
			numero = scan.nextDouble();

			System.out.println("digite outro número:");
			nume = scan.nextDouble();
			// soma dos valores com reaproveitamento de variaveis.
			soma = numero - nume;

			System.out.println("soma:" + soma);
			break;
		// operador de multiplicação.
		case "x":
			System.out.println("digite um número a multiplicar:");
			numero = scan.nextDouble();

			System.out.println("digite outro número:");
			nume = scan.nextDouble();
			// soma dos valores com reaproveitamento de variaveis.
			soma = numero * nume;

			System.out.println("soma:" + soma);
			break;
		// soma de divisão.
		case "/":
			System.out.println("digite um número a dividir:");
			numero = scan.nextDouble();

			System.out.println("digite outro número:");
			nume = scan.nextDouble();
			// soma dos valores com reaproveitamento de variaveis.
			soma = numero / nume;

			System.out.println("soma:" + soma);
			break;
		default: // caso digitar um operador inválido.
			System.out.println("operador inválido");
			break;
		}

		scan.close();

	}

}
