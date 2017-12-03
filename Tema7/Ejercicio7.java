/*
 * 
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 * 
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio7 {

  public static void main(String[] args) {

    int[] num = new int[100];
    Scanner x = new Scanner(System.in);
    int cambio;
    int numeroNuevo;
    System.out.print("Cadena de 100 números aleatorios de entre 0 y 20,");
    System.out.println(" introduce un numero y lo cambiare en la cadena por el que quieras.");
    for (int i = 0; i < 100; i++) {
      num[i] = (int) (Math.random() * 20);
      System.out.print(num[i] + " ");
    }
    System.out.println(" ");
    System.out.print("Introduce el número que quieres cambiar: ");
    cambio = x.nextInt();
    System.out.println(" ");
    System.out.print("Introduce el número por el que será sustituido: ");
    numeroNuevo = x.nextInt();
    for (int i = 0; i < 100; i++) {
      if (num[i] == cambio) {
        num[i] = numeroNuevo;
        System.out.print("'" + num[i] + "' ");
      } else{
        System.out.print(num[i] + " ");
      }
    }
  }
}
