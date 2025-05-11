package boletin2.ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
	
	static String FICHERO = "src\\boletin2\\ejercicio1\\carta.txt";

	public static void main(String[] args) {
		
		String cadena= "";
		
		int caracteres = 0;

		int lineas = 0;

		int palabras = 0;

		String Palabras[];
		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO));) {

			cadena = reader.readLine();

			while (cadena != null) {

				lineas++;

				Palabras = cadena.split(" ");

				palabras += Palabras.length;

				for (int i = 0; i < Palabras.length; i++) {

					caracteres += Palabras[i].length();

				}

				cadena = reader.readLine();

			} 

			System.out.println("Caracteres: " + caracteres);
			System.out.println("Lineas: " + lineas);
			System.out.println("Palabras: " + palabras);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
