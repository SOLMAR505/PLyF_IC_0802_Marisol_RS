

public class Principal {
    public static void main (String[] args){
        System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine_1().calculate(5,5));
        System.out.println("==> CalculadoraLong --> resultado = " + Principal.engine_2().calculate(6,2));

        System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine_0(5, 2).calculate(5,4));
    }
    //retorna un objeto de tipo "CalculadoraInt"
    public static CalculadoraInt engine_1(){
        return (x,y) -> x * y;
    }
    public static CalculadoraInt engine_0(int x1, int y1){

        //System.out.println("Parametros de la suma: " + x +"," +y);
        return (x,y) -> x + y;
    }
     
     //Retorna un objetode tipo CalculadoraLong
    
    public static CalculadoraLong engine_2(){
        return (x,y) -> x - y;
    }
    
}
