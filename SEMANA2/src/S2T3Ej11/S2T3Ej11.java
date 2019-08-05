/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.

 */
package S2T3Ej11;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numeroIntroducido = teclado.nextInt();

        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
          System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }
}
