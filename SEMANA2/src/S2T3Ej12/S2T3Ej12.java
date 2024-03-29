/*
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
 * debe introducir por teclado.

 */
package S2T3Ej12;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
        System.out.print("Por favor, introduzca n: ");
        int n = teclado.nextInt();
        
        switch (n) {
        case 1:
          System.out.print("0");
          break;
        case 2:
          System.out.print("0 1");
          break;
        default:
          System.out.print("0 1");
          int f1 = 0;
          int f2 = 1;
          int aux;
          while(n > 2) {
              aux = f1;
              f1 = f2;
              f2 = aux + f2;
              System.out.print(" " + f2);
              n--;
          }
      }
      System.out.println();
    }
}
