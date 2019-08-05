/*
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2`1, 2`2, 2`3, 2`4 y 2`5.
 */
package S2T3Ej15;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número real como base: ");
        double base = teclado.nextDouble();

        System.out.print("Introduzca un múmero entero como exponente: ");
        int exponenteFinal = teclado.nextInt();

        double potencia;
        int exponente;

        for (int i = 1; i <= exponenteFinal; i++) {

          potencia = 1;
          exponente = i;

          for (int j = 0; j < exponente; j++) {
            potencia *= base;
          }

          System.out.println(base + "^" + i + " = " + potencia);
        }
    }
}
