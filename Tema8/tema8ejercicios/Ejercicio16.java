
package tema8ejercicios;

import tema8ejercicios.matematicas.Ejercicios1a14;

/**
 *
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio16 {
    public static void main(String[] args) {
      
      for (int i = 1; i <= 99999; i++) {
      if (Ejercicios1a14.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
    }

}
