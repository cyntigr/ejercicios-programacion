/*
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
 * es necesario.
 * 
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    int[] num = new int[20];
    int[] auxiliar = new int[20];
    int[] auxiliarImpar = new int[20];
    int cuentaPar = 0;
    int cuentaImpar = 0;
    System.out.println("Creamos un array de 20 números de entre 0 y 100, ponemos los pares primero.");
    // Comparamos par e impar y contamos los pares e impares
    for (int i = 0; i < 20; i++) {
      num[i] = (int) (Math.random() * 101);
      if (num[i] % 2 == 0) {
        auxiliar[cuentaPar++] = num[i];
      } else {
        auxiliarImpar[cuentaImpar++] = num[i];
      }
    }
    // Array almacenado al principio
    for (int i = 0; i < 20; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println(" ");
    for (int i = 0; i < cuentaPar; i++) {
      num[i] = auxiliar[i];
    }
    for (int i = cuentaPar; i < 20; i++) {
      num[i] = auxiliarImpar[i - cuentaPar];
    }
    for (int i = 0; i < 20; i++) {
      System.out.print(num[i] + " ");

    }
  }
}
