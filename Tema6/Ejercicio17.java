/*
 * 
 * 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro
 * de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo. 
 * 
 * 
 * 
 */
package tema6;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    System.out.println("Pinta una pecera con un pececito dentro.");
    System.out.println("----------------------------------------");
    Scanner x = new Scanner(System.in);
    System.out.print("Introduce el alto de la pecera, minimo 4: ");
    int alto = x.nextInt();
    System.out.print("Introduce el ancho de la pecera, minimo 4: ");
    int ancho = x.nextInt();
    int espacio = 0;
    int pececito = ((int) (Math.random() * ((ancho-2)*(alto-2))) + 1);
    // Parte superior de la pecera
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println(" ");
    // Parte central
    for (int i = 0; i < (alto - 2); i++) {
      System.out.print("*");

      for (int j = 0; j < (ancho - 2); j++) {
        if(espacio == pececito){
          System.out.print("&");
        } else{
        System.out.print(" ");
        }
        espacio++;
      }
      System.out.print("*");
      System.out.println(" ");
    }
    // Parte inferior de la pecera
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }

  }
}
