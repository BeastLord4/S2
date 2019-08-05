/*
 * Realiza un programa que calcule la media de tres notas.
 */
package S2T2Ej7;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T2Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa calcula la media de tres notas.");
        
        System.out.print("Por favor, introduzca la primera nota: ");
        Double nota1 = teclado.nextDouble();
        
        System.out.print("Ahora introduzca la segunda nota: ");
        Double nota2 = teclado.nextDouble();
            
        System.out.print("Por último introduzca la tercera nota: ");
        Double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media es: "+ media);     
    }
}
