/**
*
*
*Realiza un programa que pida un número por teclado y que luego muestre ese
*número al revés.
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio25{
  public static void main(String[] args) {
    
    System.out.println("Número de reves.");
    System.out.println("----------------");
    
    System.out.print("Introduce un número: ");
    
    Scanner x = new Scanner(System.in);
    int numero = x.nextInt();
    
    int numeroPrincipio = numero;
    int vuelta = 0;
    
    while (numeroPrincipio > 0) {
      vuelta = (vuelta * 10) + (numeroPrincipio % 10);
      numeroPrincipio /= 10;
    }
    System.out.print("El número " + numero + " del reves sería " + vuelta);
  }
}
