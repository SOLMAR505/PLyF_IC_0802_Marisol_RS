public interface pruebaExamen(){
	default void mensajeHola();
	public void mensajeHola();
	mensajeHola -> System.out.println("Hola mi nombre es Marisol");

default void mensajeHola(String cadena1){

	System.out.println("La cadena es "+ cadena1);
}

public void mensajeHola(String cadena2){
	System.out.println("la cadena es "+ cadena2);
}
public void operacionPrueba(int num1, int num2){
	return num1 + num2;
}
public static void operacionPrueba(int x, int y){
	return x + y;
}

public void operacionPrueba(int c, int d, int e){

}

public abstract void operacionPrueba(int z, int m, int n){
	
}
}