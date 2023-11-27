package conversoes;
import leitura.leitura;
public class conversaoBases{

    // necessario fazer testes
    public static void decimalToBinario() {
        System.out.println("Digite a base decimal para conversão: ");
        int decimal = leitura.leituraInt();
        System.out.println(Integer.toBinaryString(decimal)); 
    }

    public static void decimalToOctal() {
        System.out.println("Digite a base decimal para conversão: ");
        int decimal = leitura.leituraInt();
        System.out.println(Integer.toOctalString(decimal)); 
    }

    public static void decimalToHexadecimal() {
        System.out.println("Digite a base decimal para conversão: ");
        int decimal = leitura.leituraInt();
        System.out.println(Integer.toHexString(decimal)); 
    }

    public static void binaryToDecimal() {
        System.out.println("Digite a base binária para conversão: ");
        String binary = leitura.leituraString();
        System.out.println(Integer.parseInt(binary, 2)); 
    }

    public static void octalToDecimal() {
        System.out.println("Digite a base Octal para conversão: ");
        String octal = leitura.leituraString();
        System.out.println(Integer.parseInt(octal, 8));
    }

    public static void hexadecimalToDecimal() {
        System.out.println("Digite a base Hexadecimal para conversão: ");
        String hexadecimal = leitura.leituraString();
        System.out.println(Integer.parseInt(hexadecimal, 16)); 
    }
}