/*
 * Escribe un programa que calcule el área de un triángulo.
 */
package S2T1Ej6;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej6 {
    public static void main(String[] args) {
        int res;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese base del triangulo: ");
        int base = teclado.nextInt();
        System.out.print("Ingrese altura del triangulo: ");
        int alt = teclado.nextInt();
        res=(base*alt)/2;
        System.out.println("El area del triangulo es: "+ res);
    }
}
