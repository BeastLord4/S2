/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 */
package S2T2Ej1;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T2Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String dia = teclado.nextLine();
        dia.toLowerCase();
                
        switch(dia) {
            case "lunes":
                System.out.println("Estadistica I");
            case "martes":
                // continúa debajo
            case "miércoles":
                System.out.println("Programación I");
                break;
            case "jueves":
                System.out.println("Sistemas Informáticos");
                break;
            case "viernes":
                System.out.println("Bases de Datos");
                break;
            case "sábado":
                // continúa debajo
            case "domingo":
                System.out.println("¡Ese día no hay clase!");
                break;
            default:
                System.out.println("El día introducido no es correcto.");
        }
    }
}
