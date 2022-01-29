
package fraccion;

import java.util.Scanner;

public class Fraccion {

	private Integer numerador;
	private Integer denominador;

	private enum PositivoNegativo {//Declaración del enumerado
		POSITIVA, NEGATIVA;
	}

	private PositivoNegativo signoFraccion;//Declaro un objeto del tipo enumerado

	public PositivoNegativo getSignoFraccion() {//getter para consultar el signo de la fracción
		if (numerador < 0 && denominador < 0 || numerador > 0 && denominador > 0) {

			signoFraccion = PositivoNegativo.POSITIVA;
		} else {
			signoFraccion = PositivoNegativo.NEGATIVA;

		}
		return signoFraccion;
	}

	Scanner sc = new Scanner(System.in);

	public Integer getNumerador() {
		return numerador;
	} // getters para consultar los valores de los atributos

	public Integer getDenominador() {
		return denominador;
	}

	public Fraccion(Integer numerador, Integer denominador) {// Constructor de objeto Fracción
		this.numerador = numerador;
		this.denominador = denominador;
		while (denominador.equals(0)) {// bucle para comprobar que el denominador no sea 0
			System.out.println("el denominador tiene que ser distinto a 0");
			denominador = sc.nextInt();

		}

		if (numerador < 0 && denominador < 0 || numerador > 0 && denominador > 0) {// Si se cumplen estos casos la
																					// fracción es positiva
			signoFraccion = PositivoNegativo.POSITIVA;//En ambos casos le asigno a signo Fracción su valor enumerado correspondiente
		} else {
			signoFraccion = PositivoNegativo.NEGATIVA;// Si se cumplen estos casos la fraciión
														// es negativa
		}//Esta última parte no sé si la tengo bien, si lo dejo entre comentarios me sigue funcionando el programa con normalidad.
	}

	// métodos para las operaciones con las fracciones, reciben un objeto Fracción
	public void sumar(Fraccion frac2) {
		if (this.denominador != frac2.denominador) {
			System.out.println("No se puede realizar la operación, los denominadores no son iguales");
		} else {
			this.numerador = this.numerador + frac2.numerador;
			System.out.println("El resultado de la suma de ambas fracciones es: " + toString());
		}

	}

	public void restar(Fraccion frac2) {
		if (this.denominador != frac2.denominador) {
			System.out.println("No se puede realizar la operación, los denominadores no son iguales");
		} else {
			this.numerador = this.numerador - frac2.numerador;
			System.out.println("El resultado de la resta de ambas fracciones es: " + toString());

		}
	}

	public void multiplicar(Fraccion frac2) {
		this.numerador = this.numerador * frac2.numerador;
		this.denominador = this.denominador * frac2.denominador;
		System.out.println("El resultado de la multiplicación de ambas fracciones es: " + toString());
	}

	public void dividir(Fraccion frac2) {
		this.numerador = this.numerador * frac2.denominador;
		this.denominador = this.denominador * frac2.numerador;
		System.out.println("El resultado de la división de ambas fracciones es: " + toString());
	}
//Lo que más me ha costado del ejercicio es implementar los métodos de las operaciones con las fracciones
	//Al final lo resolví pero llegar a la conclusión de operar con el atributo del primer objeto y que lo que recibiese 
	//el métoido fuese el valor de otro objeto me supuso bastante tiempo y búsqueda en StackOverflow
	
	public String toString() {// método para devolver el valor de los atributos en forma de cadena
		String numerador = String.valueOf(this.numerador);
		String denominador = String.valueOf(this.denominador);
		String fracstring = String.valueOf(getSignoFraccion()) + " " + numerador + "/" + denominador;//Muestro por pantalla el signo de la fracción
		return fracstring;																			// y la fracción en String

	}

}
