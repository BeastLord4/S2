/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.

 */
package S2T1Ej2;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej2 {
    public static void main(String[] args) {
        double pesetas;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Euros a convertir: ");
        double euros = teclado.nextDouble();
        pesetas= euros*166.386;
        System.out.println("€"+euros+" a pesetas es: "+ pesetas);
    }
}
