
package fraccion;

import java.util.Scanner;

public class Fraccion {

	private Integer numerador;
	private Integer denominador;

	private enum PositivoNegativo {//Declaraci�n del enumerado
		POSITIVA, NEGATIVA;
	}

	private PositivoNegativo signoFraccion;//Declaro un objeto del tipo enumerado

	public PositivoNegativo getSignoFraccion() {//getter para consultar el signo de la fracci�n
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

	public Fraccion(Integer numerador, Integer denominador) {// Constructor de objeto Fracci�n
		this.numerador = numerador;
		this.denominador = denominador;
		while (denominador.equals(0)) {// bucle para comprobar que el denominador no sea 0
			System.out.println("el denominador tiene que ser distinto a 0");
			denominador = sc.nextInt();

		}

		if (numerador < 0 && denominador < 0 || numerador > 0 && denominador > 0) {// Si se cumplen estos casos la
																					// fracci�n es positiva
			signoFraccion = PositivoNegativo.POSITIVA;//En ambos casos le asigno a signo Fracci�n su valor enumerado correspondiente
		} else {
			signoFraccion = PositivoNegativo.NEGATIVA;// Si se cumplen estos casos la fracii�n
														// es negativa
		}//Esta �ltima parte no s� si la tengo bien, si lo dejo entre comentarios me sigue funcionando el programa con normalidad.
	}

	// m�todos para las operaciones con las fracciones, reciben un objeto Fracci�n
	public void sumar(Fraccion frac2) {
		if (this.denominador != frac2.denominador) {
			System.out.println("No se puede realizar la operaci�n, los denominadores no son iguales");
		} else {
			this.numerador = this.numerador + frac2.numerador;
			System.out.println("El resultado de la suma de ambas fracciones es: " + toString());
		}

	}

	public void restar(Fraccion frac2) {
		if (this.denominador != frac2.denominador) {
			System.out.println("No se puede realizar la operaci�n, los denominadores no son iguales");
		} else {
			this.numerador = this.numerador - frac2.numerador;
			System.out.println("El resultado de la resta de ambas fracciones es: " + toString());

		}
	}

	public void multiplicar(Fraccion frac2) {
		this.numerador = this.numerador * frac2.numerador;
		this.denominador = this.denominador * frac2.denominador;
		System.out.println("El resultado de la multiplicaci�n de ambas fracciones es: " + toString());
	}

	public void dividir(Fraccion frac2) {
		this.numerador = this.numerador * frac2.denominador;
		this.denominador = this.denominador * frac2.numerador;
		System.out.println("El resultado de la divisi�n de ambas fracciones es: " + toString());
	}
//Lo que m�s me ha costado del ejercicio es implementar los m�todos de las operaciones con las fracciones
	//Al final lo resolv� pero llegar a la conclusi�n de operar con el atributo del primer objeto y que lo que recibiese 
	//el m�toido fuese el valor de otro objeto me supuso bastante tiempo y b�squeda en StackOverflow
	
	public String toString() {// m�todo para devolver el valor de los atributos en forma de cadena
		String numerador = String.valueOf(this.numerador);
		String denominador = String.valueOf(this.denominador);
		String fracstring = String.valueOf(getSignoFraccion()) + " " + numerador + "/" + denominador;//Muestro por pantalla el signo de la fracci�n
		return fracstring;																			// y la fracci�n en String

	}

}
