package boletin1.ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Principal {

	public static void main(String[] args) {
		
		String linea;
		
		String nombres="";
		String nombre;
		
		int sumaEdades=0;
		int edad;
		double mediaEdad;
		int contE=0;
		
		double sumaEstatura=0;
		double estatura;
		double mediaEstatura;
		int contEs=0;
		
		
		
		
		
			try {
				BufferedReader sc= new BufferedReader(new FileReader("src/boletin1/ejercicio3/Alumnos.txt"));
			
				linea=sc.readLine();
				
				while(linea!=null) {
					
					String almacenar[]= linea.split(" ");
					
					nombre=almacenar[0];
					
					edad= Integer.parseInt(almacenar[1]);
					
					estatura= Double.parseDouble(almacenar[2]);
					
					nombres+=nombre + "\n";
					
					if(edad>0) {
					sumaEdades+=edad;
					contE++;
					}
					
					if(estatura>0) {
					sumaEstatura+=estatura;
					contEs++;
					}
					
					
					linea=sc.readLine();
					
				}
				
				mediaEdad=sumaEdades / contE;
				mediaEstatura= sumaEstatura/contEs;
				
				System.out.println("Nombres: \n" + nombres);
				System.out.println("Media de edades: "+mediaEdad);
				System.out.println("Media estatura: " + mediaEstatura);
				
				sc.close();
			
			} catch (IOException e) {
				System.err.println("No existe");
			}
			

			
		

	}

}
