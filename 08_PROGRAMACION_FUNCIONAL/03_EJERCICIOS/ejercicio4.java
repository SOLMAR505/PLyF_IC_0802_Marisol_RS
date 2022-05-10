import java.util.List;

public class ejercicio4{
	public static void main(String[] args){
		List<String> courses = List.of("Spring","Spring Boot", "API",
			"Microservices", "AWS", "PCF", "Azure","Docker", "Kubernetes"); 
	
		
		System.out.println("\n Lista de cursos con mayor a 4 caracteres: ");
		countCaracteres(courses);
	}

	private static void print(String course){
		System.out.print(course + ", " );
	}

	private static void countCaracteres(List<String> courses){
		courses.stream()
		.filter(course -> course.length() >= 4)
		.forEach(course -> System.out.print(course + " -> " + course.length() + "\n" ));
		System.out.println("");
	}
	
}