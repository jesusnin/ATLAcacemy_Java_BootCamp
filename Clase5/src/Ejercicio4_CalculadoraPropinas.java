import java.util.Scanner;

/**
 * 4) Calculadora de propinas:
 * Pídele al usuario que ingrese el total de la cuenta en un restaurante.
 * Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
 * Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
 * @author jesus quezada nin - Equipo 4 - Javasonicos Lucarianos
 * @version 1.0
*/

public class Ejercicio4_CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner ingresa = new Scanner(System.in);
        System.out.println("Calculadora de Propinas en Restaurant");
        System.out.println("*--------------------------------------------------*");
        System.out.println("Favor ingresar el valor total de la cuenta: $");
        double valorCuenta = ingresa.nextDouble();
        System.out.println("Favor ingresar el valor total de la \npropina que desea dejar (porcentaje): %");
        double valorPropina = ingresa.nextDouble();
        System.out.println("*--------------------------------------------------*");
        System.out.println("La propina  a pagar es: .....................$" + calcularPropina(valorCuenta, valorPropina));
        System.out.println("El valor de la cuenta final a pagar es:..... $" + calcularTotalCuenta(valorCuenta, calcularPropina(valorCuenta, valorPropina)));
        System.out.println("*--------------------------------------------------*");
    }

    static double calcularPropina(double cuenta, double propina)
    {
        return cuenta * (propina / 100);
    }

    static double calcularTotalCuenta(double cuenta, double propina)
    {
        return cuenta + propina;
    }
}
