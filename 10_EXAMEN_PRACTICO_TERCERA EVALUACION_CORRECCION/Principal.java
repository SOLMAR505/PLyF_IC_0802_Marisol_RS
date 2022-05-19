//1
public class Principal{
	//2
	public static void main(String []args){
		//3
		PruebaExamen pe;
		//4
		pe = (b1,b2,b3) -> {System.out.println(1 + 4 + 6);};
		//5
		System.out.println(PruebaExamen.operacionPrueba( 1,2));
		//6 y 7
		pe.mensajeHola("hola");
		//8
		pe = (b1,b2,b3) -> {System.out.println(1+(2*3));};
		//9
		pe.operacionPrueba(5, PruebaExamen.operacionPrueba(7,7),PruebaExamen.operacionPrueba(2,2));
		//12
		miMetodo(pe);
		//13
		miMetodo((b1,b2,b3) -> System.out.println( 4 + (4/2)));
		//16
		pe = (b1,b2,b3) -> System.out.println(2.0 + (10.0/5.0));
		//17
		miMetodo(pe, 6, 7, 8); 
	}
	//10
	private static void miMetodo(PruebaExamen pe){
		//11
		pe.operacionPrueba(5,PruebaExamen.operacionPrueba(1,2), PruebaExamen.operacionPrueba(1,2));
	}
	//14
	private static void miMetodo(PruebaExamen pe, int b1, int b2, int b3){
		//15
		pe.operacionPrueba(b1,PruebaExamen.operacionPrueba(b1,b2),PruebaExamen.operacionPrueba(b3,b3));
	}

}