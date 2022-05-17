import java.util.List;

public class ejercicio2{
	public static void main(String[] args){
		List<String> courses = List.of("Spring","Spring Boot", "API",
			"Microservices", "AWS", "PCF", "Azure","Docker", "Kubernetes"); 
	
		
		System.out.println("\n Lista de todos los cursos: ");
		printAllListCourses(courses);
	}

	private static void print(String courses){
		System.out.print(courses + ", " );
	}

	private static void printAllListCourses(List<String> courses){
		courses.stream()
		.forEach(ejercicio2::print);
		System.out.println("");
		
	}

	
}