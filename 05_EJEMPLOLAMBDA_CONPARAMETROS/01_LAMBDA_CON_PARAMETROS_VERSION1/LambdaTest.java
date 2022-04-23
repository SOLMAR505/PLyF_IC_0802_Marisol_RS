public class LambdaTest {
    public static void main(String[] args){
		//expresion lambda ==> representa un objeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.print(num1 + num2);

		op.imprimeSuma(5, 10);
}