import java.lang.Math;

public class operacoesLog{
    
    public static double logNatural(){
        System.out.println("Digite o número que deseja saber o log na base e");
        double a = leitura.leituraDouble();
        return Math.log(a);
    }

    public static double logBase10(){
        System.out.println("Digite o número que deseja saber o log na base 10");
        double a = leitura.leituraDouble();
        return Math.log10(a);
    }

    public static double logBase2(){
        System.out.println("Digite o número que deseja saber o log na base 2");
        double a = leitura.leituraDouble();
        double x = Math.log(a) / Math.log(2.0);
        return x;
    }

    public static double logQualquerBase(){
        System.out.println("Digite a base do logaritmo e o valor que deseja calcular");
        double a = leitura.leituraDouble();
        System.out.println("Agora digite o valor que deseja calcular");
        double b = leitura.leituraDouble();
        double x = Math.log(b) / Math.log(a);
        return x;
    }
}