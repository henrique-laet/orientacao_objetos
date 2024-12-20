package ultilMeEx;

public class CurrencyConverter {

    public static final double IOF = 6;

    public static double ConversaoDolares(double dolar, double quantidadeDolares) {
        return (dolar / 100 * IOF + dolar) * quantidadeDolares;
    }






}
