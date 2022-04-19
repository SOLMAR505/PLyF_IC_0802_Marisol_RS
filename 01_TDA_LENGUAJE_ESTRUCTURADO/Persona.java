public class Persona {
	String nombre;
	String apellidos;
	int edad;
	String genero;

	public Persona(){
		this.nombre="Marisol";
		this.apellidos="Reyes Sanchez";
		this.edad=23;
		this.genero="F";
	}

	public Persona(String nombre, String apellidos, int edad, String genero){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.genero=genero;
	}


	public void datos(){
		System.out.println("Nombre:"+nombre+"\nApellidos:"+apellidos+" \nEdad:"+edad+"\nGenereo:"+genero);
	}
	public void comer(){
		System.out.println("\n"+nombre+" Come con sus padres");
	}
	public void caminar(){
		System.out.println("Esta caminando todo el dia");
	}
	public void hablar(){
		System.out.println("Habla con sus amigos todo el dia");
	}
	public void dormir(){
		System.out.println("Esta persona duerme 6 horas");
	}

}