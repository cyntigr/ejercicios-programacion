/*
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio9 {

  public static void main(String[] args) {
    int[] num = new int[8];
    Scanner x = new Scanner(System.in);
    System.out.println("Introducción de números y como resultado te dire si son par e impar.");
    System.out.println("Introduce 8 números enteros: ");

    for (int i = 0; i < 8; i++) {
      num[i] = x.nextInt();
    }
    for (int i = 0; i < 8; i++) {
      if (num[i] % 2 == 0) {
        System.out.println(num[i] + " par");
      } else {
        System.out.println(num[i] + " impar");
      }
    }
  }

}
