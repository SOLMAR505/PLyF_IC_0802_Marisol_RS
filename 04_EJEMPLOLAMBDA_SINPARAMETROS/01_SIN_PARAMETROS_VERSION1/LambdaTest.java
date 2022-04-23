public class LambdaTest{
	public static void main(String[] args){
		//expresion lambda ==> representa un objeto de una interfaz funcional
		FunctionTest ft = () -> System.out.print("Hola mundo");

		ft.saludar();
}
