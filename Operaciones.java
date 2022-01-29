package fraccion;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {

		int numerador, denominador;// variables para que el usuario introduzca el valor de numerador y denominador
		int eleccion;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el numerador de la primera fracción: ");
		numerador = sc.nextInt();

		System.out.print("Introduce el denominador de la primera fracción: ");
		denominador = sc.nextInt();

		Fraccion frac1 = new Fraccion(numerador, denominador);// primer objeto Fracción

		System.out.print("Introduce el numerador de la segunda fracción: ");
		numerador = sc.nextInt();

		System.out.print("Introduce el denominador de la segunda fracción: ");

		denominador = sc.nextInt();

		Fraccion frac2 = new Fraccion(numerador, denominador);// Segundo objeto Fracción
		System.out.println("----------------------------------------------------------------------");
		System.out.println("La primera fracción es: " + " " + frac1.toString());// Invocaciones e impresión por pantalla
																				// de
																				// las fracciones en forma de cadena además del sino de cada una
		System.out.println("La segunda fracción es: " + " " + frac2.toString());
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Introduce 1 para suma, 2 para resta, 3 para multiplicación y 4 para división");

		eleccion = sc.nextInt();
		// Invocación a los diferentes métodos del programa, con un switch para hacerlo
		// más bonico y que no sobreescriba los valores de los atributos
		switch (eleccion) {
		case 1:
			frac1.sumar(frac2);
			break;
		case 2:
			frac1.restar(frac2);
			break;
		case 3:
			frac1.multiplicar(frac2);
			break;
		case 4:
			frac1.dividir(frac2);
			break;

		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Si deseas hacer más cálculos vuelve a iniciar el programa ");
		
		sc.close();
	}

}