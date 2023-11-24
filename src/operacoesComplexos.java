import java.lang.Math;

public class operacoesComplexos{

    public static Complex leComplexo(){
        double a = leitura.leituraDouble();
        double b = leitura.leituraDouble();
        Complex ab = new Complex (a, b);
        return ab;
    }

    public static Complex somaComplexos(Complex a, Complex b){
        return Complex.add(a, b);
    }

}