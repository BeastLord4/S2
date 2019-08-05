/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package S2T3Ej8;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero y le mostraré la tabla de multiplicar: ");
        int numeroIntroducido = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
          System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
        }

    }
}
