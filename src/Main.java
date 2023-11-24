import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){

        System.out.println("Bem-vindo a calculadora cientifica em java, as operações disponíveis no momento são:");
        int choiceFinish = 0;

        while(choiceFinish == 0){ // loop de operações caso o usuário deseje
            int menuChoice = menu(); // escolhe qual grupo de operações
            int Choose = 0;// escolha de qual operação
            switch(menuChoice){
                case 1: // operações básicas
                    Choose = leitura.leituraInt();
                    escolha.escolhaOpBasica(Choose);
                break;
                case 2: // operações trigonométricas
                    Choose = leitura.leituraInt();
                    escolha.operacoesTrigonometricas(Choose);
                break;
                case 3: // operações logarítmicas
                    Choose = leitura.leituraInt();
                    escolha.operacoesLog(Choose);
                break;
                case 4:
                    Choose = leitura.leituraInt();
                    escolha.operacoesComplexo(Choose);
                break;
                default:
                    System.out.println("Operação não existente");
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

