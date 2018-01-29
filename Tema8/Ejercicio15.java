package tema8ejercicios;

/**
 * Muestra los números primos entre 1 y 1000.
 * 
 * @author Cintia García Ruiz 1ºDAM
 */
import tema8ejercicios.matematicas.Ejercicios1a14;

public class Ejercicio15 {

  public static void main(String[] args) {

    for (int i = 1; i <= 1000; i++) {
      if (Ejercicios1a14.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
