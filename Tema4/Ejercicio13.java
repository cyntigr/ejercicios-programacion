/**
*Escribe un programa que ordene tres números enteros introducidos por
*teclado.
*
*
* @utor Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
  
    Scanner x = new Scanner(System.in);
    System.out.println("3 numeros enteros a ordenar: ");
    System.out.println("-----------------------------");
    
    System.out.println("Introduce el 1ª: ");
    int num1 = Integer.parseInt(x.nextLine());
    
    System.out.println("Introduce el 2ª: ");
    int num2 = Integer.parseInt(x.nextLine());
    
    System.out.println("Introduce el 3ª: ");
    int num3 = Integer.parseInt(x.nextLine());
    
    if ((num1 > num2) && (num2 > num3)) {
      System.out.print("Este es el orden " + " " + num1 + " " + num2 + " " + num3);
    }
    if ((num2 > num3) && (num3 > num1)) {
      System.out.print("Este es el orden " + " " + num2 + " " + num3 + " " + num1);
    }
    if ((num2 > num1) && (num1 > num3)) {
      System.out.print("Este es el orden " + " " + num2 + " " + num1 + " " + num3);
    }
    if ((num1 > num3) && (num3 > num2)) {
      System.out.print("Este es el orden " + " " + num1 + " " + num3 + " " + num2);
    }
    if ((num3 > num1) && (num1 > num2)) {
      System.out.print("Este es el orden " + " " + num3 + " " + num1 + " " + num2);
    }
    if ((num3 > num2) && (num2 > num1)) {
      System.out.print("Este es el orden " + " " + num3 + " " + num2 + " " + num1);
    }
    
  }
}
