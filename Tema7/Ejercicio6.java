/*
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 *
 *
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio6 {

  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int[] num = new int[15];
    int[] cambio = new int[15];
    System.out.println("Introduce números al azar y te los cambiare de posicion");
    System.out.println("Introduce 15 números: ");

    for (int i = 0; i < 15; i++) {
      num[i] = x.nextInt();

    }
    int j = 1;
    cambio[0] = num[14];
    for (int i = 0; i < 14; i++) {
      cambio[j] = num[i];
      System.out.println(cambio[i]);
      j++;
    }
    System.out.println(cambio[14]);
  }

}
