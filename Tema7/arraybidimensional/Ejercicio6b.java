/*
 * 
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 *
 */
package tema7;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio6b {

  public static void main(String[] args) {
    int[][] numero = new int[6][10];
    int[][] unico = new int[6][10];
    int fila, columna;
    int minimo = MAX_VALUE;
    int maximo = MIN_VALUE;
    int filaMaxima = 0;
    int filaMinima = 0;
    int columnaMaxima = 0;
    int columnaMinima = 0;
    boolean igual;
    int i;
    
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        do {
          numero[fila][columna] = (int) (Math.random() * 1001);

          // Comprueba si el número generado ya está en el array.
          igual = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (numero[fila][columna] == numero[i / 10][i % 10]) {
              igual = true;
            }
          }
        } while (igual);
      }
    }
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        if (numero[fila][columna] < minimo) {
          minimo = numero[fila][columna];
          filaMinima = fila;
          columnaMinima = columna;
        }
        if (numero[fila][columna] > maximo) {
          maximo = numero[fila][columna];
          filaMaxima = fila;
          columnaMaxima = columna;
        }
      }
    }
    System.out.print("\n      ");
    for (columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();

    System.out.print("    ┌");
    for (columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    for (fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for (columna = 0; columna < 10; columna++) {
        System.out.printf("%5d ", numero[fila][columna]);

      }
      System.out.print("│");
      System.out.println(" ");
    }
    System.out.print("    └");
    for (columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┘");

    System.out.print("El número maximo es el " + maximo);
    System.out.println(" y su posición es fila " + filaMaxima + " columna " + columnaMaxima);
    System.out.print("El número mínimo es el " + minimo);
    System.out.println(" y su posición es fila " + filaMinima + " columna " + columnaMinima);
  }

}
