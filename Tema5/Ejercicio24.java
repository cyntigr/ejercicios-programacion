/**
*
*
*Escribe un programa que lea un número n e imprima una pirámide de números
*con n filas como en la siguiente figura:
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;
 
public class Ejercicio24{
  public static void main(String[] args) {
    
    System.out.println("Pinta una pirámide con altura dada.");
    System.out.println("----------------------------------------------");
    
    System.out.print("Introduce la altura: ");
    
    Scanner x = new Scanner(System.in);
    
    int alturaIntroducida = x.nextInt();
    int altura = 1;
    
    int i = 0;
    int espacios = alturaIntroducida - 1;

    while (altura <= alturaIntroducida) {
      
      //espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // línea de números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
      
    }
  }
}
