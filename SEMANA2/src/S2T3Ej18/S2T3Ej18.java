/*
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 */
package S2T3Ej18;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;

        // pide dos números y se verifica que sean distintos
        do {
          System.out.print("Introduzca un número entero: ");
          primerNumero = teclado.nextInt();
          System.out.print("Introduzca otro número entero distinto al anterior: ");
          segundoNumero = teclado.nextInt();

          if(primerNumero == segundoNumero) {
            System.out.println("Los números introducidos no son válidos, deben ser distintos.");
          }
        } while (primerNumero == segundoNumero);

        // si el primer número es mayor que el segundo, se intercambian los valores
        if (primerNumero > segundoNumero) {
          int aux = primerNumero;
          primerNumero = segundoNumero;
          segundoNumero = aux;
        }

        for(int i = primerNumero; i <= segundoNumero; i += 7) {
          System.out.print(i + " ");
        }

        System.out.println();
    }
}
