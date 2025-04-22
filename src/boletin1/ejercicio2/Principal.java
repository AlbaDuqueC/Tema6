package boletin1.ejercicio2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int numero;
		int suma=0;
		double media;
		int cont=0;
		
		try {
			Scanner sc= new Scanner(new FileReader("src/boletin1/ejercicio2/Enteros.txt"));
			
			while(sc.hasNextInt()) {
				numero=sc.nextInt();
				suma+=numero;
				cont++;
			}
			
			media=suma/cont;
			
			System.out.println("Suma: "+ suma);
			System.out.println("Media: "+ media);
		
		} catch (FileNotFoundException e) {
			System.err.println("No hay fichero");
		}

	}

}
