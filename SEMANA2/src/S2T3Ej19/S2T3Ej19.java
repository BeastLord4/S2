/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 */
package S2T3Ej19;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = teclado.nextInt();

        System.out.print("Introduzca el carácter de relleno: ");
        String relleno = teclado.next();

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;

        while (planta <= alturaIntroducida) {

          // inserta espacios
          for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
          }

          // pinta la línea
          for (int i = 1; i <= longitudDeLinea; i++) {
            System.out.print(relleno);
          }

          System.out.println();

          planta++;
          espacios--;
          longitudDeLinea += 2;
        }
    }
}
