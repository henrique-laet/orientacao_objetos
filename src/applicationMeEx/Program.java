package applicationMeEx;

import ultilMeEx.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do dólar?: ");
        double dolar = sc.nextDouble();
        System.out.println("Quantos dólares vai ser comprados?: ");
        double quantidadeDolares = sc.nextDouble();

        double d = CurrencyConverter.ConversaoDolares(dolar, quantidadeDolares);

        System.out.printf("Valor a ser pago em reais = %.2f%n", d);




        sc.close();
    }
}
