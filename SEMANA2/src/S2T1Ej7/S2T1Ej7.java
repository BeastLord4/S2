/*
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible
 */
package S2T1Ej7;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
        double baseImponible = teclado.nextDouble();
        
        System.out.println("Base imponible "+baseImponible);
        System.out.println("IVA             "+ (baseImponible * 0.12));
        System.out.print("--------------------------\n");
        System.out.println("Total          "+ (baseImponible * 1.12));
    }
}
