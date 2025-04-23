package boletin1.ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static final String FICHERO = "src/boletin1/ejercicio5/datos.txt";
	
	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO, true))) {
			
			Scanner sc= new Scanner (System.in);
			
			String nombre;
			
			int edad;
			
			System.out.println("Introduzca su nombre: ");
			nombre= sc.nextLine();
			
			System.out.println("Introduzaca su edad");
			edad=sc.nextInt();
			
			bw.write(nombre + " " + edad);
			
			bw.newLine();
			
			bw.flush();
			
			bw.close();
			
		} catch (IOException e) {
			System.err.println("No existe el fichero");
		}

	}

}
