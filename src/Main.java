import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){

        System.out.println("Bem-vindo a calculadora cientifica em java, as operações disponíveis no momento são:");
        int choiceFinish = 0;

        while(choiceFinish == 0){
            int menuChoice = menu();
            int Choose = 0;

            if(menuChoice == 1){ // operacoes basicas
                Choose = leitura.leituraInt();
                escolha.escolhaOpBasica(Choose);
            }

            else if(menuChoice == 2){ // operacoes trigonometricas
                Choose = leitura.leituraInt();
                escolha.operacoesTrigonometricas(Choose);
            }

            System.out.println("Deseja realizar outra operação? 0 - Sim   1 - Não");
            choiceFinish = leitura.leituraInt();
        } 
    }


    // menu inicial
    public static int menu(){
        menu.menuTipoOp();
        int escolhaOperacao = leitura.leituraInt();
        menu.operacaoEscolhida(escolhaOperacao);
        return escolhaOperacao;
    }

    
}

