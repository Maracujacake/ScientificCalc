public class escolha{
    public static void escolhaOp(int Choose, double a, double b){
        switch(Choose){
            case 1:
                System.out.println(calculadora.soma(a, b));
                break;
            case 2:
                System.out.println(calculadora.subtracao(a, b));
                break;
            case 3:
                System.out.println(calculadora.multiplicacao(a, b));
                break;
            case 4:
                System.out.println(calculadora.divisao(a, b));
                break;
            case 5:
                System.out.println(calculadora.potenciacao(a, b));
                break;
            case 6:
                System.out.println(calculadora.radiciacao(a));
                break;
            default:
                System.out.println("Operação inexistente, tente novamente");
        }
    }
    
}