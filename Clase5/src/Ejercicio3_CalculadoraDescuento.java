import java.util.Scanner;

/**
 * 3) Calculadora de descuento:
 * Pídele al usuario que ingrese el precio original de un producto.
 * Pídele al usuario que ingrese el porcentaje de descuento.
 * Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
 * Muestra el precio final al usuario.
 * @author jesus quezada nin - Equipo 4 - Javasonicos Lucarianos
 * @version 1.0
 * */
public class Ejercicio3_CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner capturado;
        capturado = new Scanner(System.in);
        System.out.println("Calculadora de Descuento");
        System.out.println("--------------------------------------------------");
        System.out.println("Favor ingresar el valor del producto: $");
        double valorProducto = capturado.nextDouble();
        System.out.println("Favor ingresar el valor del descuento(porcentaje): %");
        double valorDescuento = capturado.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.println("El valor del descuento total es: $" + calcularDescuento(valorProducto, valorDescuento));
        System.out.println("El precio final a pagar es:..... $" + calcularPrecioFinal(valorProducto, calcularDescuento(valorProducto, valorDescuento)));
    }

    static double calcularDescuento(double precio, double descuento)
    {
        return (precio * descuento / 100);
    }

    static double calcularPrecioFinal(double precio, double descuentoFinal)
    {
        return precio - descuentoFinal;
    }
}
