/**
*Realiza un programa que diga si un número introducido por teclado
*es par y/o divisible entre 5.
*
*
*
* 
*
*@utor Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
  
    Scanner x = new Scanner(System.in);
    System.out.println("Par o divisible entre 5: ");
    System.out.println("-------------------------");
    
    System.out.println("Introduce el numero: ");
    int num1 = Integer.parseInt(x.nextLine());
    
    if ((num1 % 2) == 0) {
      System.out.println("Este numero es par.");
    } else {
      System.out.println("No es par.");
    }
    
    if ((num1 % 5) == 0) {
      System.out.println("Este numero es divisible entre 5.");
    } else {
      System.out.print("No es divisible por 5.");
      }
  }
}
