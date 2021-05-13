package StaticMethods;

public class CurrencyConverter {
    public static double dolarToReal(double dprice, double value){
        double real = value * dprice;
        return real += real * 0.06;
    }
}
