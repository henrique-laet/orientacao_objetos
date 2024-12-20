package applicationEx1;

import entitiesEx1.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Entre com a largura e altura do retângulo: ");
        rectangle.widht = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println();

        double area = rectangle.area();
        double perimetro = rectangle.perimeter();
        double diagonal = rectangle.diagonal();

        System.out.printf("AREA: %.2f%n", rectangle.area());
        System.out.printf("PERIMETRO: %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
