

public class Principal {
    public static void main (String[] args){
        Principal.engine((int x, int y) -> (long x1, long x2) -> x1 + x2);
    }
    public static void engine(CalculadoraInt obj){
        int x = 2, y= 4;
        CalculadoraLong o = obj.calcular(x,y);
        System.out.println("Resultado = " + o.calcular((long)x, (long)y));
    }
}
