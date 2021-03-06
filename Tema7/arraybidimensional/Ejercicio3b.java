/*
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio3b {

  public static void main(String[] args) {
    int fila, columna;
    int[][] numero = new int[5][6];
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        numero[fila][columna] = (int)(Math.random()*899)+100;
        System.out.print("Fila " + fila + ", Columna " + columna + ": " + numero[fila][columna]);
        
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
    for (fila = 0; fila < 4; fila++) {
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
