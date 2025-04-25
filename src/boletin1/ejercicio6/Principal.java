package boletin1.ejercicio6;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static final String FICHERO_DESORDENADO="src/boletin1/ejercicio6/NumeroDesordenados.txt";
	public static final String FICHERO_ORDENADO="src/boletin1/ejercicio6/NumerosOrdenados.txt";

	public static void main(String[] args) {
		
		try (Scanner br= new Scanner (new FileReader(FICHERO_DESORDENADO))){
		
			List<Integer> lista= new ArrayList<Integer>();
		
			int num;
			
			while(br.hasNextInt()) {
				
				num= br.nextInt();
				
				lista.add(num);
								
				
			}
			Collections.sort(lista);
			
			BufferedWriter bw= new BufferedWriter(new FileWriter(FICHERO_ORDENADO));
			
			for(int i= 0 ; i<lista.size() ; i++) {
				
				num=lista.get(i);
				
				bw.write(String.valueOf(num));
				
				bw.flush();
				
			}
			
			
			
			
			
		} catch (IOException e) {
			System.err.println("No existe el fichero");
		}

	}

}
