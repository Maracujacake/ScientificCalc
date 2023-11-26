public class menu{

    public static void menuTipoOp(){
        System.out.println("1 - Operações básicas\n2 - Operações trigonométricas\n3 - Operações logarítmicas\n4 - Operações com números complexos\n");
    }

    public static void operacaoEscolhida(int escolha){
        switch(escolha){
            case 1:
                System.out.println("1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao\n5 - potenciação\n6 - radiciação");
            break;
            case 2:
                System.out.println("1 - seno\n2 - cosseno\n3 - tangente\n4 - arcoseno\n5 - arcocosseno\n6 - arcotangente");
            break;
            case 3:
                System.out.println("1 - Logaritmo natural\n2 - Logaritmo na base 10\n3 - Logaritmo na base 2\n4 - Logaritmo na base que escolher");
            break;
            case 4:
                System.out.println("1 - Soma com números complexos\n2 - Subtração com números complexos\n3 - Multiplicação com números complexos\n4 - Divisão com números complexos");
            break;
            default:
                System.out.println("Tipo de operação inválida, tente novamente");

        }
    }
}