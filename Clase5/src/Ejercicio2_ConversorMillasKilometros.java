import java.util.Scanner;

/**
 * 2) Conversor de millas a kilómetros:
 * Pídele al usuario que ingrese una distancia en millas.
 * Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
 * Muestra la distancia en kilómetros al usuario.
 * @author jesus quezada nin - Equipo 4 - Javasonicos Lucarianos
 * @version 1.0
 * */

public class Ejercicio2_ConversorMillasKilometros {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        System.out.println("Conversor de medidas de Millas a Kilometros");
        System.out.println("--------------------------------------------------");
        System.out.println("Favor ingresar la cantidad de millas a calcular en kilometros: ");
        double millas = capturar.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.println("El total de kilometros es : " + ConversorKilometros(millas)+" km");
        System.out.println("--------------------------------------------------");
    }

    static double ConversorKilometros(double millasCalcular)
    {
        return millasCalcular * 1.60934;
    }
}
