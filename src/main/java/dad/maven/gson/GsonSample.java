package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonSample {
	
	
	
	public static void main(String[] args) {
		
		
		String nombre;
		String apellidos;
		Integer edad;
		
		Scanner in= new Scanner(System.in);
		System.out.println("Nombre: ");
		nombre=in.next();
		System.out.println("Apellidos: ");
		apellidos=in.next();
		System.out.println("Edad: ");
		edad=in.nextInt();
		
		
		
		Persona p= new Persona(nombre,apellidos,edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		in.close();
		
	}

}
