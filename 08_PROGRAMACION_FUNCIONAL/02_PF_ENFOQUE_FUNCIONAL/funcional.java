import java.util.List;

public class funcional{
	public static void main(String[] args){
		List<Integer> numbers = List.of (12,9,13,4,6,2,4,12,15);

		System.out.println("Using to --> [System.out::print] by default");
		printAllNumbersInListFunctional_Two(numbers);
		System.out.println("\n printAllNumbersInListFunctional: ");
		printAllNumbersInListFunctional(numbers);
		System.out.println("\n printEvenNumbersInListFunctional: ");
		printEvenNumbersInListFunctional(numbers);
		System.out.println("\n printSquares0fEvenNumbersInListFunctional: ");
		printSquares0fEvenNumbersInListFunctional(numbers);
		System.out.println("");
	}

	private static void print(int number){
		System.out.print(number + ", " );
	}
	private static boolean isEven(int number){
		return (number % 2 == 0);
	}

	private static void printAllNumbersInListFunctional_Two(List<Integer> numbers){
		//que hacer
		numbers.stream()
		.forEach(System.out::print);
		System.out.println("");
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
		.forEach(funcional::print);
		System.out.println("");
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
			.filter(funcional::isEven)
			.forEach(funcional::print);
		System.out.println("");
	}

	private static void printSquares0fEvenNumbersInListFunctional(List<Integer>numbers){
		numbers.stream()
			.filter(number -> number % 2 == 0)
			.map(number -> number * number)
			.forEach(funcional::print);
		System.out.println("");
	}

}	