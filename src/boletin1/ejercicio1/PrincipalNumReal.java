package boletin1.ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PrincipalNumReal {

	public static void main(String[] args) {
		
		double suma=0;
		double media;
		double numero;
		int cont=0;
		
		try {
			Scanner sc= new Scanner(new FileReader("src/boletin1/ejercicio1/NumerosReales.txt"));
			
			while(sc.hasNextDouble()) {
				numero=sc.nextDouble();
				suma+=numero;
				cont++;
			}
			
			media=suma/cont;
			System.out.println("Suma: " + suma);
			System.out.println("Media: " + media);
		
		} catch (FileNotFoundException e) {
			
			System.err.println("No hay fichero");;
		}

	}

}
