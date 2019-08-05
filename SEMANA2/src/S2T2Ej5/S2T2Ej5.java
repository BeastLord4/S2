/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
 */
package S2T2Ej5;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T2Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        Double a = teclado.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        Double b = teclado.nextDouble();

        if (a == 0) {
          System.out.println("Esa ecuación no tiene solución real.");
        }else {
          System.out.println("x = " + (-b/a));
        }
    }
}
