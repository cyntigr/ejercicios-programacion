package tema8ejercicios.matematicas;

/**
 *
 * @author cyntia
 */
public class Ejercicio37 {

  /**
   * Devuelve un número pasado a código morse
   *
   *
   * @param n es un número entero
   *
   * @return morse es el código que obtenemos de n
   */
  public static String convierteEnMorse(int n) {
    String morse = "";
    n = Ejercicios1a14.voltea(n);
    int aux;
    while (n > 0) {
      aux = n % 10;
      if (aux == 1) {
        morse += ".____";
      }
      if (aux == 2) {
        morse += "..___";
      }
      if (aux == 3) {
        morse += "...__";
      }
      if (aux == 4) {
        morse += "...._";
      }
      if (aux == 5) {
        morse += ".....";
      }
      if (aux == 6) {
        morse += "_....";
      }
      if (aux == 7) {
        morse += "__...";
      }
      if (aux == 8) {
        morse += "___..";
      }
      if (aux == 9) {
        morse += "____.";
      }
      if (aux == 0) {
        morse += "_____";
      }
      n /= 10;
    }
    return morse;
  }
}
