/*
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha. 
 * 
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio2b {

  public static void main(String[] args) {
    int fila, columna;
    Scanner x = new Scanner(System.in);
    int[][] numero = new int[5][6];
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", Columna " + columna + ": ");
        numero[fila][columna] = x.nextInt();
      }
    }
    System.out.println(" ");
    for (columna = 0; columna < 5; columna++) {
      for (fila = 0; fila < 4; fila++) {
        numero[fila][5] += numero[fila][columna];
      }
    }
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        numero[4][columna] += numero[fila][columna];
      }
    }
    for (fila = 0; fila < 4; fila++){
      numero[4][5] += numero[fila][5];
    }
    for (fila = 0; fila < 5; fila++) {
      for (columna = 0; columna < 6; columna++) {
        System.out.printf("   %5d        ", numero[fila][columna]);
      }
      System.out.println(" ");
    }
  }
}
