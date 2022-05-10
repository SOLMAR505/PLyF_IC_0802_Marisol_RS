import java.util.List;

public class ejercicio3{
	public static void main(String[] args){
		List<String> courses = List.of("Spring","Spring Boot", "API",
			"Microservices", "AWS", "PCF", "Azure","Docker", "Kubernetes"); 
	
		
		System.out.println("\n Lista de todos los cursos: ");
		buscarString(courses);
	}

	private static void print(String course){
		System.out.print(course + ", " );
	}

	private static void buscarString(List<String> courses){
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(ejercicio3::print);
		System.out.println("");
		
	}


	
}