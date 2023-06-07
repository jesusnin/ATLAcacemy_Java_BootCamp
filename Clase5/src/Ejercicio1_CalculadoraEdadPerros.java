import java.util.Scanner;

/**
 * 1) Calculadora de edad de perros:
 * Pídele al usuario que ingrese la edad de su perro.
 * Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
 * @author jesus quezada nin - Equipo 4 - Javasonicos Lucarianos
 * @version 1.0
 */

public class Ejercicio1_CalculadoraEdadPerros {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Calculadora de la edad de los perros (mascota)");
        System.out.println("--------------------------------------------------");
        System.out.println("Favor ingresar la edad de su perro (mascota): ");
        int edad = valor.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("Su perro (mascota) tiene  " + CalcularEdad(edad)+" en la edad de perros.");
        System.out.println("--------------------------------------------------");
    }

    static int CalcularEdad(int edad)
    {
        return edad*7;
    }
}
