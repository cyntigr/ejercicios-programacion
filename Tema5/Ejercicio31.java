/**
*
*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
*programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
*mitad (división entera entre 2) de la altura más uno.
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio31{
  public static void main(String[] args) {
    
    System.out.println("Pinta una L por pantalla");
    System.out.println("------------------------");
    
    System.out.print("Introduce la altura de la L: ");
    
    Scanner x = new Scanner(System.in);
    int altura = x.nextInt();
    
    //altura L
    for(int i= 1; i < altura; i++){
      System.out.println("*");
    }
    //BASE
    for(int j= 1; j <= (altura/2+1); j++){
      System.out.print("*");
    }
  }
}
