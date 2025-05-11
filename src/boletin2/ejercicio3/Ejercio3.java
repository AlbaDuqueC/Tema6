package boletin2.ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercio3 {
	
	static String FICHERO = "src\\boletin2\\ejercicio3\\Texto3.txt";

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int cont = 0;

		String cadena = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO));) {

			cadena = reader.readLine();

			while (cont < 5 && cadena != null) {

				System.out.println(cadena);
				cadena = reader.readLine();
				cont++;

				if (cont == 5) {
					sc.nextLine();
					cont = 0;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e1) {
			e1.printStackTrace();
		}


	}

}
