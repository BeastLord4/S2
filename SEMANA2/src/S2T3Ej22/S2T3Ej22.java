/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
package S2T3Ej22;

/**
 *
 * @author Steven Dual
 */
public class S2T3Ej22 {
    public static void main(String[] args) {
        System.out.print("Números primos entre 2 y 100: ");

        boolean esPrimo = true;

        for (int n = 2; n <= 100; n++) {

          // comprueba si n es primo
          esPrimo = true;
          for (int i = 2; i < n; i++) {
            if (n % i == 0) {
              esPrimo = false;
            }
          }

          // si n es primo, se muestra por pantalla
          if (esPrimo) {
            System.out.print(n + " ");
          }
        }
        System.out.println();
    }
}
