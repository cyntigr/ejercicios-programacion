/**
*
*
*Realiza un programa que pida primero un número y a continuación un dígito.
*El programa nos debe dar la posición (o posiciones) contando de izquierda a
*derecha que ocupa ese dígito en el número introducido.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio26{
  public static void main(String[] args) {
    
    System.out.println("Posición de un numero de izquierda a derecha");
    System.out.println("--------------------------------------------");
    
    System.out.println("Introduce un número: ");
    
    Scanner x = new Scanner(System.in);
    int numero = x.nextInt();
    System.out.print("Introduce una cifra: ");
    
    int cifra = x.nextInt();
    
    int numeroPrincipio = numero;
    int vuelta = 0;
    
    while (numeroPrincipio > 0) {
      vuelta = (vuelta * 10) + (numeroPrincipio % 10);
      numeroPrincipio /= 10;
    }
    
    int cuenta = 0;
    int ultimaCifra = 0;
    
    do {
      ultimaCifra = vuelta % 10;
      vuelta = vuelta / 10;
      cuenta ++;
      if (ultimaCifra == cifra){
        System.out.print("Se encuentra en la posición: " + cuenta + " ");
      }
    } while (vuelta > 0);
    
    
    
  }
}
