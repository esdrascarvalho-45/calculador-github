package calculo;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// calculadora com os operadores + , -, x e /.
		System.out.println("Digite um operador a soma + , - , x ou /");
		String operador = scan.nextLine();
		// op��o de escolha conforme os operadores disponiveis.
		switch (operador) {

		// operador de soma.
		case "+":
			System.out.println("digite um n�mero a somar:");
			double numero = scan.nextDouble();

			System.out.println("digite outro n�mero:");
			double nume = scan.nextDouble();
			// soma dos valores.
			double soma = numero + nume;

			System.out.println("soma:" + soma);
			break;
		// operador de subtra��o.
		case "-":
			System.out.println("digite um n�mero a subtrair:");
			numero = scan.nextDouble();

			System.out.println("digite outro n�mero:");
			nume = scan.nextDouble();
			// soma dos valores com reaproveitamento de variaveis.
			soma = numero - nume;

			System.out.println("soma:" + soma);
			break;
		// operador de multiplica��o.
		case "x":
			System.out.println("digite um n�mero a multiplicar:");
			numero = scan.nextDouble();

			System.out.println("digite outro n�mero:");
			nume = scan.nextDouble();
			// soma dos valores com reaproveitamento de variaveis.
			soma = numero * nume;

			System.out.println("soma:" + soma);
			break;
		// soma de divis�o.
		case "/":
			System.out.println("digite um n�mero a dividir:");
			numero = scan.nextDouble();

			System.out.println("digite outro n�mero:");
			nume = scan.nextDouble();
			// soma dos valores com reaproveitamento de variaveis.
			soma = numero / nume;

			System.out.println("soma:" + soma);
			break;
		default: // caso digitar um operador inv�lido.
			System.out.println("operador inv�lido");
			break;
		}

		scan.close();

	}

}
