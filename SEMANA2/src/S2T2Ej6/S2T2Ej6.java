/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√(2h/g siendo g = 9.81m/s2
 */
package S2T2Ej6;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T2Ej6 {
    final static double g = 9.81; 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cálculo del tiempo de caída de un objeto.");
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        Double h = teclado.nextDouble();
        
        double s = Math.sqrt(2*h/g);
        System.out.println("El objeto tarda "+s+" segundo es caer"); 
    }
}
