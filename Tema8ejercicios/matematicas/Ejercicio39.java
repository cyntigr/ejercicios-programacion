package tema8ejercicios.matematicas;

/**
 *
 * @author cyntia
 */
public class Ejercicio39 {
  public static String convierteEnPalabras(int n){
    String palabra = "";
    n = Ejercicios1a14.voltea(n);
    int aux;
    while (n > 0) {
      aux = n % 10;
      if (aux == 1) {
        palabra += "uno";
      }
      if (aux == 2) {
        palabra += "dos";
      }
      if (aux == 3) {
        palabra += "tres";
      }
      if (aux == 4) {
        palabra += "cuatro";
      }
      if (aux == 5) {
        palabra += "cinco";
      }
      if (aux == 6) {
        palabra += "seis";
      }
      if (aux == 7) {
        palabra += "siete";
      }
      if (aux == 8) {
        palabra += "ocho";
      }
      if (aux == 9) {
        palabra += "nueve";
      }
      if (aux == 0) {
        palabra += "cero";
      }
      n /= 10;
      if(n > 0){
        palabra += ", ";
      }
    }
    return palabra;
  }
}
