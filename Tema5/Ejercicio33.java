
/**
*
*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
*programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
*dos asteriscos menos en la base para simular la curvatura de las esquinas
*inferiores.
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio33{
  public static void main(String[] args) {
    
    System.out.println("Pinta una U por pantalla");
    System.out.println("------------------------");
    
    System.out.print("Introduce la altura de la U: ");
    
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
