package boletin1.ejercicio4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String linea;
		
		try {
			BufferedWriter wr= new BufferedWriter(new FileWriter("src/boletin1/ejercicio4/ej4.txt"));
			
			linea= sc.nextLine();
			
			while(!linea.equals("fin")) {
				
				wr.write(linea);
				
				wr.newLine();
				
				wr.flush();
				
				linea= sc.nextLine();
			}
			
			wr.close();
		
		
		} catch (IOException e) {
			System.out.println("No existe el fichero");
		}
		

	}

}
