public class escolha{
    public static void escolhaOpBasica(int Choose){
        switch(Choose){
            case 1:
                System.out.println(operacoesBasicas.soma());
                break;
            case 2:
                System.out.println(operacoesBasicas.subtracao());
                break;
            case 3:
                System.out.println(operacoesBasicas.multiplicacao());
                break;
            case 4:
                System.out.println(operacoesBasicas.divisao());
                break;
            case 5:
                System.out.println(operacoesBasicas.potenciacao());
                break;
            case 6:
                System.out.println(operacoesBasicas.radiciacao());
                break;
            default:
                System.out.println("Operação inexistente, tente novamente");
        }
    }

    public static void operacoesTrigonometricas(int Choose){
        switch(Choose){
            case 1:
                System.out.println(operacoesTrigo.seno());
            break;
            case 2:
                System.out.println(operacoesTrigo.cosseno());
            break;
            case 3:
                System.out.println(operacoesTrigo.tangente());
            break;
            case 4:
                System.out.println(operacoesTrigo.arcoSeno());
            break;
            case 5:
                System.out.println(operacoesTrigo.arcoCosseno());
            break;
            case 6:
                System.out.println(operacoesTrigo.arcoTangente());
            break;
            default:
                System.out.println("Operacão inexistente, tente novamente");
        }
    }
    
}