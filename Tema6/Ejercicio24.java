/*
 * 
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos.
 * 
 */
package tema6;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio24 {

  public static void main(String[] args) {
    int posicion;
    Scanner x = new Scanner(System.in);
    int vuelta = 0;
    int cuenta = 0;

    System.out.println("Por favor, introduzca un número entero positivo: ");
    int numero = x.nextInt();
    int numeroPrincipio = numero;

    do {
      numeroPrincipio /= 10;
      cuenta++;
    } while (numeroPrincipio > 0);
    posicion = (int) (Math.random() * cuenta);
    if (posicion > 0) {
      for (int i = 0; i < posicion; i++) {
        numero /= 10;
      }
    }
    numero %= 10;
    System.out.println(numero);
  }

}
