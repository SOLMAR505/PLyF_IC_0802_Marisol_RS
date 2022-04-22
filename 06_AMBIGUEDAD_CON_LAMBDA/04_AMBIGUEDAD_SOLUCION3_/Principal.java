

public class Principal {
    public static void main (String[] args){
        CalculadoraInt objInt= (x,y) -> x + y;
        CalculadoraLong objLong= (x,y) -> x * y;
        CalculadoraLong obj1Long= (x,y) -> x - y;
        CalculadoraLong obj2Long= (x,y) -> x / y;
        CalculadoraLong obj3Long= (x,y) -> x % y;
        Principal.engine(objInt);
        Principal.engine(objLong);
        Principal.engine(obj1Long);
        Principal.engine(obj2Long);
        Principal.engine(obj3Long);
    }
    //sobrecarga
    private static void engine(CalculadoraInt cal){
        int x = 2, y= 4;
        int resultado = cal.calcular(x, y);
        System.out.println("Resultado = " + resultado);
    }
    private static void engine(CalculadoraLong cal){
        long x = 2, y= 4;
        long resultado = cal.calcular(x, y);
        System.out.println("Resultado = " + resultado);
    }
}
