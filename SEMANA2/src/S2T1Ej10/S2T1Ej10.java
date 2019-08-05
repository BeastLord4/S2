/*
 * Realiza un conversor de Mb a Kb.
 */
package S2T1Ej10;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej10 {
    public static void main(String[] args) {
        int Kb;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Megabyte a convertir: ");
        int Mb = teclado.nextInt();
        Kb= Mb*1024;
        System.out.println(Mb+" Mb equivalen a: "+ Kb + " Kb" );
    }
}
