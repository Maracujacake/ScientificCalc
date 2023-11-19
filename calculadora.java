import java.lang.Math;

public class calculadora{

    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }

    public static double potenciacao(double a, double b){
        return Math.pow(a, b);
    }

    public static double radiciacao(double a){
        return Math.sqrt(a);
    }
}