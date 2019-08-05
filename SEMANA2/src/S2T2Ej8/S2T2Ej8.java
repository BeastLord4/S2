/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 */
package S2T2Ej8;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T2Ej8 {
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
        
        if (media < 5) {
            System.out.println("Insuficiente");
        }

        if ((media >= 5) && (media < 6)) {
            System.out.println("Suficiente");
        }

        if ((media >= 6) && (media < 7)) {
            System.out.println("Bien");
        }

        if ((media >= 7) && (media < 9)) {
            System.out.println("Notable");
        }

        if (media >= 9) {
            System.out.println("Sobresaliente");
        }
    }
}
