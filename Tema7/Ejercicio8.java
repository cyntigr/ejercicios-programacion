/*
 * 
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * 
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio8 {

  public static void main(String[] args) {
    int[] num = new int[12];
    Scanner x = new Scanner(System.in);
    System.out.println("Introduce las temperaturas medias de cada mes de un año: ");
    
    for (int i = 0; i < 12; i++) {
      num[i] = x.nextInt();
    }
    System.out.print("Enero");
    for (int i = 0; i < num[0]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Febrero");
    for (int i = 0; i < num[1]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Marzo");
    for (int i = 0; i < num[2]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Abril");
    for (int i = 0; i < num[3]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Mayo");
    for (int i = 0; i < num[4]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Junio");
    for (int i = 0; i < num[5]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Julio");
    for (int i = 0; i < num[6]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Agosto");
    for (int i = 0; i < num[7]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Septiembre");
    for (int i = 0; i < num[8]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Octubre");
    for (int i = 0; i < num[9]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Noviembre");
    for (int i = 0; i < num[10]; i++) {
      System.out.print("|");
    }
    System.out.println(" ");
    System.out.print("Diciembre");
    for (int i = 0; i < num[11]; i++) {
      System.out.print("|");
    }
  }
}
