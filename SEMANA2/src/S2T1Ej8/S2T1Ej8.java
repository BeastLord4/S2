/*
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 */
package S2T1Ej8;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej8 {
    public static void main(String[] args) {
        int salario;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas por el empleado: ");
        int horas = teclado.nextInt();
        salario=horas*12;
        System.out.println("El salario del empleado es: €."+ salario);
    }
}
