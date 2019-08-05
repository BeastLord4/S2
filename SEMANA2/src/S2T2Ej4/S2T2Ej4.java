/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.

 */
package S2T2Ej4;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T2Ej4 {
    public static void main(String[] args) {
        int sueldoSemanal;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = teclado.nextInt();
        
        if(horasTrabajadas<40){
            sueldoSemanal=12*horasTrabajadas;
        }
        else{
            sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
        }
         System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
    }
}
