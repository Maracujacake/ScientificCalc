import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
    
        menu();
        int Choose = leitura.leituraInt();
        System.out.println("primeiro numero:");
        double a = leitura.leituraDouble();
        double b = 0;
        if(Choose != 6){
            System.out.println("segundo numero:");
            b = leitura.leituraDouble();
        }
        escolha.escolhaOp(Choose, a, b);
    }

    // menu inicial
    public static void menu(){
        System.out.println("Bem-vindo a calculadora cientifica em java, as operações disponíveis no momento são:");
        System.out.println("escolha de operações:");
        System.out.println("1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao\n5 - potenciação\n6 - radiciação");
    }

    
}

