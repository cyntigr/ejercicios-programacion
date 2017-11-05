/**
*
*
*
*Escribe un programa que, dado un número entero, diga cuáles son y cuánto
*suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
*izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
*números largos.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio32{
  public static void main(String[] args) {
    
    System.out.println("Aora diremos cuales son los numeros pares de un número introducido y su suma");
    System.out.println("----------------------------------------------------------------------------");
    
    System.out.print("Introduce un número entero: ");
    
    Scanner x = new Scanner(System.in);
    long numero = x.nextLong();
    long numeroPrincipio = numero;
    long vuelta = 0;
    
    //Damos la vuelta al numero
    while (numeroPrincipio > 0) {
      vuelta = (vuelta * 10) + (numeroPrincipio % 10);
      numeroPrincipio = numeroPrincipio / 10;
    }
    long ultimaCifra = 0;
    long suma = 0;
    //Comprobamos los pares
    do {
      ultimaCifra = vuelta % 10;
      if (ultimaCifra % 2 == 0){
        System.out.print(ultimaCifra + " ");
        suma += ultimaCifra;
      }
      vuelta = vuelta / 10;
    } while (vuelta > 0);
    System.out.println(" ");
    System.out.print("La suma de estas cifras pares es: " + suma);
  }
}
