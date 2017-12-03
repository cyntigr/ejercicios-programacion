/*
 * 
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 * 
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {

    int[] num = new int[20];
    int[] auxiliar = new int[20];
    int[] auxiliarNoPrimo = new int[20];
    int cuentaPrimo = 0;
    int cuentaNoPrimo = 0;
    Scanner x = new Scanner(System.in);
    System.out.println("Mostramos un array de tamaño 9 y mostramos los números primos primero.");
    System.out.println("Introduce 10 números: ");
    // Comparamos si es primo y los contamos
    for (int i = 0; i < 10; i++) {
      num[i] = x.nextInt();
      int divi = 0;
      for (int j = 2; j < num[i]; j++) {
        if (num[i] % j == 0) {
          divi = 1;
        }
      }
      if (divi == 1) {
        auxiliarNoPrimo[cuentaNoPrimo++] = num[i];
      } else {
        auxiliar[cuentaPrimo++] = num[i];
      }
    }
    // Array almacenado al principio
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }
    System.out.println(" ");
    for (int i = 0; i < 10; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println(" ");

    for (int i = 0; i < cuentaPrimo; i++) {
      num[i] = auxiliar[i];
    }

    for (int i = cuentaPrimo; i < 10; i++) {
      num[i] = auxiliarNoPrimo[i - cuentaPrimo];
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }
    System.out.println(" ");
    for (int i = 0; i < 10; i++) {
      System.out.print(num[i] + " ");

    }
  }
}
