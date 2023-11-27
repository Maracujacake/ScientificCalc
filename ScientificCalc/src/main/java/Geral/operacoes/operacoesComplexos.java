package operacoes;
import java.lang.Math;
import leitura.leitura;
import bibliotecas.Complex;


public class operacoesComplexos{

    public static Complex leComplexo(){
        System.out.println("Digite a parte real do número complexo: ");
        double a = leitura.leituraDouble();
        System.out.println("E agora sua parte imaginária: ");
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


    // Parte danificada do código, aparentemente não funciona e demonstra resultados erroneos
    // ARRUMAR!!
    public static void multiComplexos(Complex a, Complex b){
        Complex resultado = Complex.multiplication(a, b);
        System.out.println(resultado.getReal() + " + i " + resultado.getImag());
    }

    public static void divisaoComplexos(Complex a, Complex b){
        Complex resultado = Complex.division(a, b);
        System.out.println(resultado.getReal() + " + i " + resultado.getImag());
    }
}