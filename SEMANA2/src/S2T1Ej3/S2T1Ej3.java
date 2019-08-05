/*
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */
package S2T1Ej3;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej3 {
    public static void main(String[] args) {
        double euro;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Pesetas a convertir: ");
        double peseta = teclado.nextDouble();
        euro= peseta*0.006;
        System.out.println(peseta+" pesetas a euros es: "+ euro);
    }
}
