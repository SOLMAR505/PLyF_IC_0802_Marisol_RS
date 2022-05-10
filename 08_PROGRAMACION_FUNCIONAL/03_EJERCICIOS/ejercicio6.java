import java.util.List;

public class ejercicio6{
	public static void main(String[] args){
		List<String> courses = List.of("Spring","Spring Boot", "API",
			"Microservices", "AWS", "PCF", "Azure","Docker", "Kubernetes"); 
	
		
		System.out.println("\n Lista de cursos con numero de caracteres: ");
		countCaracteres(courses);
	}

	private static void print(String course){
		System.out.print(course + ", " );
	}

	private static void countCaracteres(List<String> courses){
		courses.stream()
		.forEach(course -> System.out.print(course + " -> " + course.length() + "\n" ));
		System.out.println("");
	}
	
}