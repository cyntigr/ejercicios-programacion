/**
*
*
*
*Escribe un programa que calcule el factorial de un número entero leído por
*teclado.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio28{
  public static void main(String[] args) {
    
    System.out.println("Calcula el factorial de un número entero ");
    System.out.println("-----------------------------------------");
    
    System.out.print("Introduce un número entero: ");
    Scanner x = new Scanner(System.in);
    int numero = x.nextInt();
    int mult = 1;
    for (int i = 1 ; i <= numero; i++){
      mult = mult * i;
    }
    System.out.println("El factorial de " + numero + " es " + mult);
  }
}
