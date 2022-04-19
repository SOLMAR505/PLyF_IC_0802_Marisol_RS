import java.util.Scanner;
public class Principal {
    public static void main(String[]args){
		Persona p1=new Persona();

	
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa nombre: ");
		String nombre = in.nextLine();
		System.out.println("Ingresa apellidos: ");
		String apellidos = in.nextLine();
		System.out.println("Ingresa genero: ");
		String genero = in.nextLine();
		System.out.println("Ingresa edad: ");
		int edad = in.nextInt();
		

		Persona p2=new Persona(nombre,apellidos,edad,genero);
		System.out.println("\n ");
		p2.datos();
		p2.comer();
		p2.caminar();
		p2.hablar();
		p2.dormir();

		System.out.println("\n ");
		p1.datos();
		p1.comer();
		p1.caminar();
		p1.hablar();
		p1.dormir();
	}
}