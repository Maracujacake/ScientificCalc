import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        menu();
        
        System.out.println("primeiro numero:");
        double a = leitura();
        System.out.println("segundo numero:");
        double b = leitura();
        menuOperacao();
        Scanner scanner = new Scanner(System.in);
        int Choose = scanner.nextInt();
        escolha(Choose, a, b);
    }

    // menu inicial
    public static void menu(){
        System.out.println("Bem-vindo a calculadora cientifica em java, as operações disponíveis no momento são:");
        System.out.println("soma\nsubtracao\nmultiplicacao\ndivisao");
        System.out.println("Digite os dois primeiros números da sua operação");
    }

    // leitura dos numeros
    public static double leitura(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // escolha com base no numero inteiro
    public static void escolha(int Choose, double a, double b){
        switch(Choose){
            case 1:
                System.out.println(soma(a, b));
                break;
            case 2:
                System.out.println(subtracao(a, b));
                break;
            case 3:
                System.out.println(multiplicacao(a, b));
                break;
            case 4:
                System.out.println(divisao(a, b));
                break;
            case 5:
                System.out.println(potenciacao(a, b));
                break;
            default:
                System.out.println("Operação inexistente, tente novamente");
        }
    }

    // menu que mostra operacoes existentes
    public static void menuOperacao(){
        System.out.println("Escolha a operação");
        System.out.println("Operações:");
        System.out.println("1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao\n5 - potenciação");
    }

    // operacoes
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
}

