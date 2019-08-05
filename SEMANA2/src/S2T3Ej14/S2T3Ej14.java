/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
 */
package S2T3Ej14;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej14 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cálculo de una potencia");
    
        System.out.print("Introduzca la base: ");
        int base = teclado.nextInt();

        System.out.print("Introduzca el exponente: ");
        int exponente = teclado.nextInt();

        double potencia = 1;

        if (exponente == 0) {
          potencia = 1;
        }

        if (exponente > 0) {
          for (int i = 0; i < exponente; i++) {
            potencia *= base;
          }
        }

        if (exponente < 0) {
          for (int i = 0; i < -exponente; i++) {
            potencia *= base;
          }

          potencia = 1/potencia;
        }

        System.out.println(base + "^" + exponente + " = " + potencia);
    }
}
