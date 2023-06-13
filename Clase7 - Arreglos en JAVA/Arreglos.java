package Clase7;

import java.util.Scanner;

public class Arreglos {
    public static int[] numeros = new int[5];

    public static void main(String[] args) {
        imprimirNumeros();
        MayorMenorArreglo();
        promedioArreglo();
    }

    private static void capturarNumeros() {
        Scanner teclado = new Scanner(System.in);
        int captura = 0;
        do {
            System.out.println ("Favor ingresar el numero ["+captura+"]:");
            numeros[captura] = teclado.nextInt();
            captura++;
        } while(captura < 5);
    }

    private static void imprimirNumeros()
    {
        capturarNumeros();
        for(int i=0; i < numeros.length; i++)
        {
            System.out.println ("El numero["+i+"] es: " + numeros[i]);
        }
    }

    private static void MayorMenorArreglo()
    {
        int mayor, menor;
        mayor = menor = numeros[0];
        for(int i=0; i <numeros.length; i++)
        {
            if(numeros[i] > mayor)
            {
                mayor =  numeros[i];
            }
            if(numeros[i]<menor)
            {
                menor = numeros[i];
            }
        }
        System.out.println ("El mayor valor del arreglo es: " + mayor);
        System.out.println ("El menor valor del arreglo es: " + menor);
    }
    private static void promedioArreglo() {
        int valorPromedio = 0;
        int sumatoriaValores = 0;
        for(int i=0; i < numeros.length; i++)
        {
            sumatoriaValores += numeros[i];
        }
        valorPromedio = sumatoriaValores/ numeros.length;
        System.out.println ("El valor promedio del arreglo es: " + valorPromedio);
    }
}
