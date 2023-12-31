package escolhaOperacao;
import operacoes.operacoesBasicas;
import operacoes.operacoesComplexos;
import operacoes.operacoesEstatisticas;
import operacoes.operacoesLog;
import operacoes.operacoesTrigo;
import conversoes.conversaoTemperatura;
import conversoes.conversaoBases;
import leitura.leitura;

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

    public static void operacoesLog(int Choose){
        switch(Choose){
            case 1:
                System.out.println(operacoesLog.logNatural());
            break;
            case 2:
                System.out.println(operacoesLog.logBase10());
            break;
            case 3:
                System.out.println(operacoesLog.logBase2());
            break;
            case 4:
                System.out.println(operacoesLog.logQualquerBase());
            break;
            default:
                System.out.println("Operacão inexistente, tente novamente");
        }
    }

    public static void operacoesComplexo(int Choose){
        switch(Choose){
            case 1:
                operacoesComplexos.somaComplexos(operacoesComplexos.leComplexo(), operacoesComplexos.leComplexo());
            break;
            case 2:
                operacoesComplexos.subtracaoComplexos(operacoesComplexos.leComplexo(), operacoesComplexos.leComplexo());
            break;
            case 3:
                operacoesComplexos.multiComplexos(operacoesComplexos.leComplexo(), operacoesComplexos.leComplexo());
            break;
            case 4:
                operacoesComplexos.divisaoComplexos(operacoesComplexos.leComplexo(), operacoesComplexos.leComplexo());
            break;
            default:
                System.out.println("Operação inexistente, tente novamente");
        }
    }


    public static void operacoesBases(int Choose){
        switch(Choose){
            case 1:
                conversaoBases.decimalToBinario();
            break;
            case 2:
                conversaoBases.decimalToOctal();
            break;
            case 3:
                conversaoBases.decimalToHexadecimal();
            break;
            case 4:
                conversaoBases.binaryToDecimal();
            break;
            case 5:
                conversaoBases.octalToDecimal();
            break;
            case 6:
                conversaoBases.hexadecimalToDecimal();
            break;
            default:
                System.out.println("Operacão inexistente, tente novamente");
        }
    }

    public static void operacoesTemperaturas(int Choose){
        switch(Choose){
            case 1:
                conversaoTemperatura.celsiusToFahrenheit();
            break;
            case 2:
                conversaoTemperatura.celsiusToKelvin();
            break;
            case 3:
                conversaoTemperatura.fahrenheitToCelsius();
            break;
            case 4:
                conversaoTemperatura.fahrenheitToKelvin();
            break;
            case 5:
                conversaoTemperatura.kelvinToFahrenheit();
            break;
            case 6:
                conversaoTemperatura.kelvinToCelsius();
            break;
            default:
                System.out.println("Operacão inexistente, tente novamente");
        }
    }

    public static void operacoesEstats(int Choose){
        switch(Choose){
            case 1:
                System.out.println(operacoesEstatisticas.calcularMedia(operacoesEstatisticas.leDados()));
            break;
            case 2:
                System.out.println(operacoesEstatisticas.calcularMediana(operacoesEstatisticas.leDados()));
            break;
            case 3:
                System.out.println(operacoesEstatisticas.calcularVariancia(operacoesEstatisticas.leDados()));
            break;
            case 4:
                System.out.println(operacoesEstatisticas.calcularDesvioPadrao(operacoesEstatisticas.leDados()));
            break;
            default:
                System.out.println("Operacão inexistente, tente novamente");
        }
    }
}