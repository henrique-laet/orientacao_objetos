package applicationEx2;

import entitiesEx2.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Nome: ");
        employee.name = sc.next();
        System.out.println("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Funcionaro :" + employee.name + ", $" + employee.NetSalary());
        System.out.println("Qual a porcentagem para aumentar o salario?: ");
        double porcentagem = sc.nextDouble();
        employee.increaseSalary(porcentagem);
        System.out.println("Dados atualizados: " + employee.NetSalary());

        sc.close();
    }
}
