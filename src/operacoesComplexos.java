import java.lang.Math;

public class operacoesComplexos{

    public static Complex leComplexo(){
        double a = leitura.leituraDouble();
        double b = leitura.leituraDouble();
        Complex ab = new Complex (a, b);
        return ab;
    }

    public static void somaComplexos(Complex a, Complex b){
        Complex resultadoSoma = Complex.add(a, b);
        System.out.println(resultadoSoma.getReal() + " + i " + resultadoSoma.getImag());
    }

    public static void subtracaoComplexos(Complex a, Complex b){
        Complex resultadoSoma = Complex.subtract(a, b);
        System.out.println(resultadoSoma.getReal() + " + i " + resultadoSoma.getImag());
    }

}