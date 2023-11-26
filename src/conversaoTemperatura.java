public class conversaoTemperatura{

    // celsius conversoes

    public static void celsiusToFahrenheit(){
        System.out.println("Digite a temperatura em Celsius para conversão: ");
        int c = leitura.leituraInt();
        double fahrenheit = (c * 9/5) + 32;
        System.out.println(fahrenheit + " Graus Fahrenheit");
    }

    public static void celsiusToKelvin(){
        System.out.println("Digite a temperatura em Celsius para conversão: ");
        int c = leitura.leituraInt();
        double kelvin = c + 273.15;
        System.out.println(kelvin + " Kelvin");
    }


    // fahrenheit conversoes

    public static void fahrenheitToCelsius(){
        System.out.println("Digite a temperatura em Fahrenheit para conversão: ");
        double f = leitura.leituraDouble();
        double celsius = (f - 32) * 5/9;
        System.out.println(celsius + " Graus Celsius");
    }

    public static void fahrenheitToKelvin(){
        System.out.println("Digite a temperatura em Fahrenheit para conversão: ");
        double f = leitura.leituraDouble();
        double kelvin = (f + 459.67) * 5/9;
        System.out.println(kelvin + " Kelvin");
    }


    // kelvin conversoes

    public static void kelvinToCelsius(){
        System.out.println("Digite a temperatura em Kelvin para conversão: ");
        double k = leitura.leituraDouble();
        double celsius = k - 273.15;
        System.out.println(celsius + " Graus Celsius");
    }


    public static void kelvinToFahrenheit(){
        System.out.println("Digite a temperatura em Kelvin para conversão: ");
        double k = leitura.leituraDouble();
        double fahrenheit = (k * 9/5) - 459.67;
        System.out.println(fahrenheit + " Graus Fahrenheit");
    }
    

}