//1
public interface PruebaExamen{
//2
	default public void mensajeHola(){
		//3
		System.out.print("Hola mi nombre es: Marisol Reyes");
	}
	
	//4
	default public void mensajeHola(String cadena){
		System.out.println("la cadena es: "+ cadena);
	}
	//5
	public static int operacionPrueba(int x, int y){
		//6
		return x + y;
	}
	//7
	public abstract void operacionPrueba(int b1, int b2, int b3);
}