/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */
package S2T1Ej4;

import java.util.Scanner;

/**
 *
 * @author Steven Dual
 */
public class S2T1Ej4 {
    public static void main(String[] args) {
        float suma, resta, multi, divi;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        float num1 = teclado.nextFloat();
        System.out.print("Ingrese otro numero: ");
        float num2 = teclado.nextFloat();
        suma= num1+num2;
        resta=num1-num2;
        multi=num1*num2;
        divi=num1/2;
        System.out.println("RESULTADOS\nSUMA="+suma+"\nRESTA="+resta+"\nMULTIPLICACION="+multi+"\nDIVISION="+divi);
    }
}
