/*
 * 
 * Escribe un programa que muestre por pantalla 100 números enteros separa-
 * dos por un espacio. Los números deben estar generados de forma aleatoria
 * en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 * 
 */
package tema6;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio25 {

  public static void main(String[] args) {
    int numero;
    for (int i = 0; i < 100; i++) {
      numero = (int) (Math.random() * 191) + 10;
      int divi = 0;
      for (int j = 2; j < numero; j++) {
        if (numero % j == 0) {
          divi = 1;
        }
      }
      if (divi == 1) {
        if (numero % 5 == 0) {
          System.out.print("[" + numero + "] ");
        } else {
          System.out.print(numero + " ");
        }
      } else {
        System.out.print("#" + numero + "# ");
      }

    }
  }

}
