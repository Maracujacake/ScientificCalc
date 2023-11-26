import java.util.Scanner;

public class leitura{

    public static double leituraDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static int leituraInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String leituraString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
