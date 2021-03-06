import java.util.List;

public class ejercicio5{
	public static void main(String[] args){
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

		System.out.println("\nNumeros impares: ");
		printOddNumbers(numbers);
	}

	private static void print(int number){
		System.out.print(number + ", " );
	}

	private static void printOddNumbers(List<Integer> numbers){
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number * number)
		.forEach(ejercicio5::print);
		System.out.println(" ");
		
	}



	
}