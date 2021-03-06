/*
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 *
 */
package tema7;


/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio4b {

  public static void main(String[] args) throws InterruptedException {
    int fila, columna;
    int[][] numero = new int[5][6];
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        numero[fila][columna] = (int) (Math.random() * 899) + 100;
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
        Thread.sleep(1000); // retardo de un segundo
      }
      System.out.println(" ");
    }
  }
}
