import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){

        int menuChoice = menu();

        if(menuChoice == 1){ // operacoes basicas
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

        else if(menuChoice == 2){ // operacoes trigonometricas
            System.out.println("Work in progress, programa encerrado");
        }
    }
    // menu inicial
    public static int menu(){
        System.out.println("Bem-vindo a calculadora cientifica em java, as operações disponíveis no momento são:");
        menu.menuTipoOp();
        int escolhaOperacao = leitura.leituraInt();
        menu.operacaoEscolhida(escolhaOperacao);
        return escolhaOperacao;
    }

    
}

