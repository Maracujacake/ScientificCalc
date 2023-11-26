public class conversaoTemperatura{

    // celsius conversoes

    public static void celsiusToFahrenheit(int c){
        double fahrenheit = (c * 9/5) + 32;
        System.out.println(fahrenheit);
    }

    public static void celsiusToKelvin(int c){
        kelvin = c + 273.15;
        System.out.println(kelvin);
    }


    // fahrenheit conversoes

    public static void fahrenheitToCelsius(int f){
        celsius = (f - 32) * 5/9;
        System.out.println(celsius);
    }

    public static void fahrenheitToKelvin(int f){
        kelvin = (f + 459.67) * 5/9;
        System.out.println(kelvin);
    }


    // kelvin conversoes

    public static void kelvinToCelsius(int k){
        celsius = k - 273.15;
        System.out.println(kelvin);
    }


    public static void kelvinToFahrenheit(int k){
        fahrenheit = (k * 9/5) - 459.67;
        System.out.println(kelvin);
    }
    

}