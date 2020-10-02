package dad.maven;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;

public class App {
	public static void main (String arg[]) {
		 
		 Persona pepito = new Persona();
		 Scanner scanner = new Scanner(System.in);
		 String nombre = scanner.nextLine();
		 String apellido = scanner.nextLine();
		 int edad = scanner.nextInt();
		 pepito.setfirstName(nombre);
		 pepito.setlastName(apellido);
		 pepito.setage(edad);
		 Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String s_json = gson.toJson(pepito);
	        System.out.println(s_json);
	 }

	
}
