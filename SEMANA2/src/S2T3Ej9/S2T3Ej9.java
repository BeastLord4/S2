/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 */
package S2T3Ej9;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej9 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDeDigitos = 1, n, numeroIntroducido;

        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        numeroIntroducido = teclado.nextInt();

        n = numeroIntroducido;

        while (n > 10) {
          n /= 10;
          numeroDeDigitos++;
        }

        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
    }
}
