/**
*
*Escribe un programa que obtenga los números enteros comprendidos entre
*dos números introducidos por teclado y validados como distintos, el programa
*debe empezar por el menor de los enteros introducidos e ir incrementando de
*7 en 7.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;
 
public class Ejercicio18{
  public static void main(String[] args) {
    System.out.println(" Saca los números enteros entre dos números");
    System.out.println("-------------------------------------------");
    
    System.out.println("Introduce un número: ");
    
    int num2 = 0;
    int num3 = 0;
    
    Scanner x = new Scanner(System.in);
    int num = x.nextInt();
    
    System.out.println("Introduce otro número: ");
    int num1 = x.nextInt();
    
    if (num < num1){ 
      num2 = num;
      num3 = num1;
    }
    if (num > num1){
      num2 = num1;
      num3 = num;
    } 
    if (num == num1){
      System.out.print("Son iguales no puedo dar los numeros comprendidos entre uno y otro");
    }
    
    for (int i = num2 + 7; i < num3; i +=7){
      System.out.print(i + "  ");
    }
  }
}
