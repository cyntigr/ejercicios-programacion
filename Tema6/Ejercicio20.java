/*
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 *
 */
package tema6;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) {
    System.out.println("Introduce el tamaño de la cuba de agua: ");
    Scanner x = new Scanner(System.in);
    int tamano = x.nextInt();
    int espacio = 0;
    int cuenta = 0;
    int agua = ((int) (Math.random() * (tamano)));

    // Parte izquierda cuba
    for (int i = 0; i < tamano; i++) {
      System.out.print("*");
      // INterior cuba
      if (espacio == agua) {
        System.out.print("♒♒♒♒");
        espacio--;
        cuenta++;
      } else {
          System.out.print("    ");
        }
      // Parte derecha
      System.out.println("*");
      espacio++;
    }
    System.out.println("******");
    System.out.println("La cuba tiene un tamaño de " + tamano + " y contiene " + cuenta + " litros de agua.");
    
  }

}
