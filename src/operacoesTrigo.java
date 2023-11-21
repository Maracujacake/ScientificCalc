public class operacoesTrigo{

    public static double seno(){
        System.out.println("Digite o ângulo: ");
        double a = leitura.leituraDouble();
        double x = Math.toRadians(a);
        return Math.sin(x);
    }

    public static double cosseno(){
        System.out.println("Digite o ângulo: ");
        double a = leitura.leituraDouble();
        double x = Math.toRadians(a);
        return Math.sin(x);
    }

    public static double tangente(){
        System.out.println("Digite o ângulo: ");
        double a = leitura.leituraDouble();
        double x = Math.toRadians(a);
        return Math.sin(x);
    }

    public static double arcoSeno(){
        System.out.println("Digite o valor do Seno (-1 a 1): ");
        double a = leitura.leituraDouble();
        double x = Math.asin(a);
        System.out.println("O arcoSeno de "+ a +" é:");
        return Math.toDegrees(x);
    }

    public static double arcoCosseno(){
        System.out.println("Digite o valor do Cosseno (-1 a 1): ");
        double a = leitura.leituraDouble();
        double x = Math.acos(a);
        System.out.println("O arcoCosseno de "+ a +" é:");
        return Math.toDegrees(x);
    }

    public static double arcoTangente(){
        System.out.println("Digite o valor da tangente: ");
        double a = leitura.leituraDouble();
        double x = Math.atan(a);
        System.out.println("O arcoTangente de "+ a +" é:");
        return Math.toDegrees(x);
    }
    
}