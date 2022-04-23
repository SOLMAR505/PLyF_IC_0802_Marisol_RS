public class LambdaTest{
	public static void main(String[] args){
		//expresion lambda ==> representa un objeto de una interfaz funcional
		FunctionTest ft = () -> System.out.print("Hola mundo");

		//ft.saludar();
		LambdaTest objeto = new LambdaTest();
		objeto.miMetodo(ft);
	}

	public void miMetodo(FunctionTest parametro){
		parametro.saludar();
	}
}
