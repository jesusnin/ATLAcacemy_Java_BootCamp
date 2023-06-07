import java.util.Scanner;

/**
 * 5) Juego de adivinar el número:
 * Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
 * @author jesus quezada nin - Equipo 4 - Javasonicos Lucarianos
 * @version 1.0
 * */

public class Ejercicio5_JuegoAdivinarNumero {
    public static void main(String[] args) {
        /* Variables de control */
        /*---------------------------------*/
        int eleccion;
        int numeroSecreto;
        int intentos      = 3;
        boolean seguir    = true;
        /*---------------------------------*/

        Scanner numero = new Scanner(System.in);
        System.out.println("Juego para adivinar un numero al azar");
        System.out.println("Tienes 3 intentos para acertar (numero secreto entre 0 y 100)");
        System.out.println("*--------------------------------------------------*");
        numeroSecreto = numeroMagico();
        while (seguir){
            System.out.println("Favor indicar el numero que eliges? ");
            eleccion = numero.nextInt();
            intentos = intentos - 1;
            if(eleccion == numeroSecreto) {
                System.out.println("*--------------------------------------------------*");
                System.out.println("! Felicidades has adivinado el numero !");
                System.out.println("Tu elegiste : " + eleccion);
                System.out.println("El numero secreto es : " + numeroSecreto);
                System.out.println("*--------------------------------------------------*");
                seguir = false;
            } else if(intentos > 0) {
                System.out.println("Oh nooo!, ese no era el numero, tienes "+ intentos +" intentos restantes.");
            }else{
                System.out.println("*--------------------------------------------------*");
                System.out.println("Que pena!! se te acabaron los intentos.");
                System.out.println("El numero secreto es : " + numeroSecreto);
                seguir = false;
                System.out.println("*--------------------------------------------------*");
            }
        }

    }

    static Integer numeroMagico() {
        return (int) (Math.random() * 100) + 1;
    }
}
