package boletin2.ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
	
	static String FICHERO = "src\\boletin2\\ejercicio2\\firmas.txt";

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;

		do {

			menu();

			System.out.println("Elija una opcion: ");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1 -> {
				escribir();
			}
			case 2 -> {
				leer();
			}
			case 3 -> {
				System.out.println("Saliendo del programa");
			}
			default -> {
				System.out.println("Opcion no valida");
			}
			}

		} while (opc != 3);

	}

	public static void menu() {
		System.out.println("1. Escribir");
		System.out.println("2. Leer");
		System.out.println("3. Salir");
	}

	public static void leer() {

		String cad = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO))) {

			cad = reader.readLine();

			System.out.println("-----------------");

			do {

				System.out.println(cad);

				cad = reader.readLine();

			} while (cad != null);

			System.out.println("-----------------");

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public static void escribir() {

		String cad = "";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO, true));) {

			System.out.println("Nombre a añadir:");
			cad = sc.nextLine();

			if (comprobar(cad)) {
				System.out.println("Esta persona ya ha firmado");
			} else {
				writer.newLine();
				writer.write(cad);
				writer.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean comprobar(String nombre) {

		boolean existe = false;

		String cad = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO))) {

			cad = reader.readLine();

			while (cad != null && !existe) {

				if (cad.equalsIgnoreCase(nombre)) {
					existe = true;
				}

				cad = reader.readLine();

			}

		} catch (FileNotFoundException e) {

			System.err.println("Archivo no encontrado: " + e.getMessage());

		} catch (IOException e1) {

			e1.printStackTrace();
		}

		return existe;

	}

}
