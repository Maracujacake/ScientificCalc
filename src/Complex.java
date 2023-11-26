public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex subtract(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    public static Complex multiplication(Complex a, Complex b){
        double parteReal = (a.getReal() * b.getReal() + a.getImag() * b.getImag());
        double parteImag = (a.getReal() * b.getImag() - a.getImag() * b.getReal());
        return new Complex(parteReal, parteImag);
    }

}