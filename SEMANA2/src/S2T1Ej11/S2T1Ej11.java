/*
 * Realiza un conversor de Kb a Mb.
 */
package S2T1Ej11;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej11 {
    public static void main(String[] args) {
         int Mb;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Megabyte a convertir: ");
        int Kb = teclado.nextInt();
        Mb= Kb/1024;
        System.out.println(Kb+" Kb equivalen a: "+ Mb + " Mb" );
    }
}
