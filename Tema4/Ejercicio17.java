/**
*Escribe un programa que diga cuál es la última cifra de un número entero
*introducido por teclado.
* 
*
*@utor Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
  
    Scanner x = new Scanner(System.in);
    System.out.println("Número que quieres te diga la última cifra: ");
    System.out.println("--------------------------------------------");
    
    System.out.println("Introduce el numero: ");
    int num = Integer.parseInt(x.nextLine());
    System.out.print("El ultimo numero es: " + (num % 10));
    
  }
}
