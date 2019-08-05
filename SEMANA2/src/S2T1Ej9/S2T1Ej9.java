/*
 * TEscribe un programa que calcule el volumen de un cono según la fórmula V = (1/3)πr2h

 */
package S2T1Ej9;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej9 {
    public static void main(String[] args) {
        double PI = 3.141592654;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Volumen de un cono");
        System.out.print("Por favor, introduzca la altura (cm): ");
        double h = teclado.nextDouble();
        System.out.print("Introduzca el radio (cm): ");
        double r = teclado.nextDouble();
        double v = (1.0/3.0) * PI * r * r * h;
        System.out.println("El volumen del cono es de " +  v + " cm³");
    }
}
