/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle while.
 */
package S2T3Ej5;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej5 {
    public static void main(String[] args) {
        int i = 320;
    
        while(i >= 160) {
            System.out.println(i);
            i-=20;
        }
    }
}
