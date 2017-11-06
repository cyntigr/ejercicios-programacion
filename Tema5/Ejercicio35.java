/**
*
*Realiza un programa que pinte una X hecha de asteriscos. El programa debe
*pedir la altura. Se debe comprobar que la altura sea un número impar mayor
*o igual a 3, en caso contrario se debe mostrar un mensaje de error.
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio35{
  public static void main(String[] args) {
    
    System.out.println("Pinta una X por pantalla");
    System.out.println("------------------------");
    
    System.out.print("Introduce la altura de la X: ");
    
    Scanner x = new Scanner(System.in);
    int altura = x.nextInt();
    
    //altura U
    for(int i=0; i < altura-1; i++){
      System.out.print("*");
      for(int k=0; k < altura -2; k++){
      System.out.print(" ");
      }
      System.out.println("*");
    }
    
    //BASE
    System.out.print(" ");
    for(int j= 1; j <= altura-2 ; j++){
      System.out.print("*");
    }
  }
}
