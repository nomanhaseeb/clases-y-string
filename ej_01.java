
package strings;
import java.util.Scanner;

public class ej_01 {
	public static void main(String[] args) {
		// pedir por teclado cadena y letra y cada letra que aparece convertir en mayusculas
		//declarar variables
		Scanner teclado = new Scanner(System.in);
		// leer varibales letra que va ser de tipo char
		System.out.println("Introduce la letra");
		char letra;
		letra = teclado.next().charAt(0);
		// variable para la frase va ser de tipo string
		System.out.println("Introduce la frase");
		String frase = teclado.next();

		String remplezar = frase.replace((char) letra, Character.toUpperCase(letra));
		// creamos el bucle for 
	
		System.out.println(remplezar);
	
		
		
		
		
	}
}
