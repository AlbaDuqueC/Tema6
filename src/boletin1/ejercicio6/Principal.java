package boletin1.ejercicio6;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static final String FICHERO_DESORDENADO="scr/boletin1/ejercicio6/NumeroDesordenados";
	public static final String FICHERO_ORDENADO="scr/boletin1/ejercicio6/NumerosOrdenados";

	public static void main(String[] args) {
		
		try (Scanner br= new Scanner (new FileReader(FICHERO_DESORDENADO))){
		
			List<Integer> lista= new ArrayList<Integer>();
		
			int num;
			
			while(br.hasNextInt()) {
				
				num= br.nextInt();
				
				lista.add(num);
								
				
			}
			
			BufferedWriter bw= new BufferedWriter(new FileWriter(FICHERO_ORDENADO));
			
			
			
			
			
		} catch (IOException e) {
			System.err.println("No existe el fichero");
		}

	}

}
