/*
 * Escribe un programa que calcule el área de un rectángulo.
 */
package S2T1Ej5;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej5 {
    public static void main(String[] args) {
        int res;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese base del rectangulo: ");
        int base = teclado.nextInt();
        System.out.print("Ingrese altura del rectangulo: ");
        int alt = teclado.nextInt();
        res=base*alt;
        System.out.println("El area del rectangulo es: "+ res);
    }
}
