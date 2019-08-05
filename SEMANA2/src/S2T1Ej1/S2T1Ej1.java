/*
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 */
package S2T1Ej1;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej1 {
    public static void main(String[] args) {
        int res;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = teclado.nextInt();
        res=num1*num2;
        System.out.println("El resultado es: "+ res);
    }
}
