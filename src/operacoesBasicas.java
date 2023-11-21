import java.lang.Math;

public class operacoesBasicas{

    public static double soma(){
        System.out.println("Digite o primeiro número da soma: ");
        double a = leitura.leituraDouble();
        System.out.println("Digite o segundo número da soma: ");
        double b = leitura.leituraDouble();
        System.out.println("O resultado é: ");
        return a + b;
    }

    public static double subtracao(){
        System.out.println("Digite o primeiro número da subtração: ");
        double a = leitura.leituraDouble();
        System.out.println("Digite o segundo número da subtração: ");
        double b = leitura.leituraDouble();
        System.out.println("O resultado é: ");
        return a - b;
    }

    public static double multiplicacao(){
        System.out.println("Digite o primeiro número da multiplicação: ");
        double a = leitura.leituraDouble();
        System.out.println("Digite o segundo número da multiplicação: ");
        double b = leitura.leituraDouble();
        System.out.println("O resultado é: ");
        return a * b;
    }

    public static double divisao(){
        System.out.println("Digite o primeiro número da divisão: ");
        double a = leitura.leituraDouble();
        System.out.println("Digite o segundo número da divisão: ");
        double b = leitura.leituraDouble();
        System.out.println("O resultado é: ");
        return a / b;
    }

    public static double potenciacao(){
        System.out.println("Digite o primeiro número da potenciação: ");
        double a = leitura.leituraDouble();
        System.out.println("Digite o segundo número da potenciação: ");
        double b = leitura.leituraDouble();
        System.out.println("O resultado é: ");
        return Math.pow(a, b);
    }

    public static double radiciacao(){
        System.out.println("Digite o número da radiciação: ");
        double a = leitura.leituraDouble();
        System.out.println("O resultado é: ");
        return Math.sqrt(a);
    }

}