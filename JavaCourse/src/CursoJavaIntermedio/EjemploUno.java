package CursoJavaIntermedio;

import java.util.Scanner;

public class EjemploUno {

	public static void main(String[] args) {
		//int longitud = 0;
		String original = "", alreves = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Introduce una palabra o frase: ");
		original = in.nextLine();
		
		//longitud = original.length();
		
		/*
		 * while (longitud != 0 ) { alreves += original.substring(longitud -1,
		 * longitud); longitud--; }
		 */
		
		for (int i = original.length(); i > 0; i--) {
			alreves += original.substring(i -1, i);
		}
		
	    System.out.println("Lo que escribiste alreves es: ");
		System.out.println(alreves);
		
	}

}
