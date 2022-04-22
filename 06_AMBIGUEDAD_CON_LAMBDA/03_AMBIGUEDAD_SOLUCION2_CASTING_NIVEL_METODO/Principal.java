

public class Principal {
    public static void main (String[] args){
        Principal.engine((CalculadoraInt)( x, y) -> x + y);
        Principal.engine((CalculadoraLong)( x, y) -> x * y);
        Principal.engine((CalculadoraLong)(x, y) -> x / y);
        Principal.engine((CalculadoraLong)(x,y) -> y - x);
        Principal.engine((CalculadoraLong)(x,y) -> y % x);
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
