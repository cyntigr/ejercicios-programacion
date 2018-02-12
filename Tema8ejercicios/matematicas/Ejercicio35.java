package tema8ejercicios.matematicas;

/**
 *
 * @author cyntia
 */
import tema8ejercicios.matematicas.Ejercicios1a14;

public class Ejercicio35 {

  /**
   * Pasamos un número al sistema de palotes
   *
   *
   * @param n número que vamos a pasar a palotes return palotes número pasado a
   * @return palotes cadena de caracteres con palotes
   */
  public static String convierteEnPalotes(int n) {
    String palotes = "";
    n = Ejercicios1a14.voltea(n);
    int aux;

    while (n > 0) {
      aux = n % 10;
      for (int i = 0; i < aux; i++) {
        palotes += "|";
      }
      n /= 10;
      if(n > 0){
        palotes += "-";
      }
    }
    
    return palotes;
  }
}
