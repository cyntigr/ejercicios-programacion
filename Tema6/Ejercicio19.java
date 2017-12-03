/*
 * 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendi-
 * dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 *
 */
package tema6;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    int numero;
    int maximoPar = Integer.MIN_VALUE;
    int minimoImpar = Integer.MAX_VALUE;
    int media = 0;
    int suma = 0;
    int contar = 0;

    for (int i = 0; i < 50; i++) {
      numero = (int) (Math.random() * 301 + -100);
      suma += numero;
      if (numero % 2 == 0) {
        if (maximoPar < numero) {
          maximoPar = numero;
        }
      } else if (minimoImpar > numero) {
        minimoImpar = numero;
      }
      contar++;
      System.out.println(numero);
    }
    System.out.println("El maximo par es el: " + maximoPar);
    System.out.println("El minimo impar es el: " + minimoImpar);
    System.out.println("La media de todos los números es: " + suma / contar);

  }

}
