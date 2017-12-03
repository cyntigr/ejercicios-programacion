/*
 * 
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 *
 *
 */
package tema6;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    int colores;
    String nombreColor = "";
    String primerColor = "";
    String segundoColor = "";
    String tercerColor = "";
    do {
      for (int i = 0; i < 3; i++) {
        colores = ((int) (Math.random() * 6) + 1);

        switch (colores) {
          case 1:
            nombreColor = "rojo";
            break;
          case 2:
            nombreColor = "violeta";
            break;
          case 3:
            nombreColor = "azul";
            break;
          case 4:
            nombreColor = "verde";
            break;
          case 5:
            nombreColor = "amarillo";
            break;
          case 6:
            nombreColor = "naranja";
            break;
        }
        if (i == 0) {
          primerColor = nombreColor;
        }
        if (i == 1) {
          segundoColor = nombreColor;
        }
        if (i == 2) {
          tercerColor = nombreColor;
        }
      }
    } while (primerColor.equals(segundoColor) || segundoColor.equals(tercerColor) || primerColor.equals(tercerColor));
    System.out.println(primerColor + " " + segundoColor + " " + tercerColor);
  }

}
