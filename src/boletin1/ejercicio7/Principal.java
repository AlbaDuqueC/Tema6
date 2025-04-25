package boletin1.ejercicio7;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static final String AGENDA = ("src/boletin1/ejercicio7/Agenda.txt");

	static Scanner sc = new Scanner(System.in);

	static Map<String, Integer> lista = new LinkedHashMap<String, Integer>();

	public static void main(String[] args) {

		int eleccion;
		boolean salir = false;

		do {

			Menu();

			eleccion = sc.nextInt();

			switch (eleccion) {
			case 1 -> {

				nuevoContacto();
			}
			case 2 -> {
				buscarPorNombre();
			}
			case 3 -> {
				mostrarTodos();
			}
			case 4 -> {
				salir = true;
			}
			}

		} while (!salir);

	}

	public static void Menu() {
		System.out.println("1. Nuevo contacto.");
		System.out.println("2. Buscar por nombre.");
		System.out.println("3. Mostrar todos.");
		System.out.println("4. Salir.");
	}

	public static void nuevoContacto() {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(AGENDA));

			String nombre;
			int num;
			String contactoNuevo;

			System.out.println("Introduzca el nombre del nuevo contacto: ");
			nombre = sc.next();

			System.out.println("Introduzca el numero del nueco contacto: ");
			num = sc.nextInt();

			contactoNuevo = nombre + ": " + num;
			lista.put(nombre, num);

			bw.write(contactoNuevo);
			
			bw.flush();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void buscarPorNombre() {

		try {
			Scanner br = new Scanner(new FileReader(AGENDA));

			String nombre;

			System.out.println("Introduce el nombre del contacto que quieras buscar: ");

			nombre = sc.next();

			if (lista.containsKey(nombre)) {

				System.out.println(lista.get(nombre));

			}

			else {
				System.out.println("No hay ningun contacto con ese nombre");
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public static void mostrarTodos() {

		try {
			Scanner br = new Scanner(new FileReader(AGENDA));

			String contactos = "";

			if (br.hasNext()) {

				contactos += br.nextLine();

				contactos += "\n";

			}

			System.out.println(contactos);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
