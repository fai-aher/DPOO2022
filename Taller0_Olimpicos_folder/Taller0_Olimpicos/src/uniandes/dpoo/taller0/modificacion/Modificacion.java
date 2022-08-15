package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	
	//Métodos//
	
	/**
	 * Método main para ejecutar la aplicación de esta clase.
	 */
	
	public static void main(String[] args)
	{
		System.out.println("Hola, mundo!\n");
		
		try
		{
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			
			System.out.println("\n");
			
			System.out.println("El país con más medallistas es:\n");
			
			System.out.println(calc.paisConMasMedallistas());
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		
	}
	
}
