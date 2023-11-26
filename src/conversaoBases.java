public class conversaoBases{

    // necessario fazer testes
    public static void decimalToBinario(int decimal) {
        System.out.println(Integer.toBinaryString(decimal)); 
    }

    public static void decimalToOctal(int decimal) {
        System.out.println(Integer.toOctalString(decimal)); 
    }

    public static void decimalToHexadecimal(int decimal) {
        System.out.println(Integer.toHexString(decimal)); 
    }

    public static void binaryToDecimal(String binary) {
        System.out.println(Integer.parseInt(binary, 2)); 
    }

    public static void octalToDecimal(String octal) {
        System.out.println(Integer.parseInt(octal, 8)); 
    }

    public static void hexadecimalToDecimal(String hexadecimal) {
        System.out.println(Integer.parseInt(hexadecimal, 16)); 
    }
}