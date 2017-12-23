/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como
 * del mínimo.
 */
package tema7;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio5b {

  public static void main(String[] args) throws InterruptedException {
    int[][] numero = new int[6][10];
    int fila, columna;
    int minimo = MAX_VALUE;
    int maximo = MIN_VALUE;
    int filaMaxima = 0;
    int filaMinima = 0;
    int columnaMaxima = 0;
    int columnaMinima = 0;

    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        numero[fila][columna] = (int) (Math.random() * 1001);
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
        Thread.sleep(400); // retardo de un segundo

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
