/*
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
 */
package S2T3Ej13;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int negativos = 0;
        int positivos = 0;
        System.out.println("Por favor, introduzca 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
          int num= teclado.nextInt();
          if (num < 0) {
            negativos++;
          } else {
            positivos++;
          }
        }

        System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
    }
}
