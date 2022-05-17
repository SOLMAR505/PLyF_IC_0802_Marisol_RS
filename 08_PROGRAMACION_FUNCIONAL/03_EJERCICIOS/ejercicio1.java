
import java.util.List;

public class ejercicio1{
	public static void main(String[] args){
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

		System.out.println("\n Numeros impares: ");
		printOddNumbers(numbers);
	}

	private static void print(int number){
		System.out.print(number + ", " );
	}

	private static void printOddNumbers(List<Integer> numbers){
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.forEach(ejercicio1::print);
		System.out.println(" ");
		
	}

	
}