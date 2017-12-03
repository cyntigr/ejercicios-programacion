/*
 * 
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
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

public class Ejercicio22 {

  public static void main(String[] args) {
    System.out.println("Introduce la altura de la serpiente: ");
    Scanner x = new Scanner(System.in);
    int altura = x.nextInt();
    int espacios = 13;
    int movimiento = 0;
    // Cabeza
    for (int i = 0; i < 13; i++) {
      System.out.print(" ");
    }
    System.out.println("@");
    // Cuerpo
    for (int i = 0; i < altura; i++) {
      movimiento = (int)(Math.random() * 3)-1;
      espacios+=movimiento;
      for(int j = 0; j<espacios;j++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }

}
