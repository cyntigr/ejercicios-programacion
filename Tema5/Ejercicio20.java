/**
*
*Igual que el ejercicio anterior pero esta vez se debe pintar
*una pirámide hueca.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;
 
public class Ejercicio20{
  public static void main(String[] args) {
    
    System.out.println("Pinta una pirámide con altura y caracter dado.");
    System.out.println("----------------------------------------------");
    
    System.out.print("Introduce un número: ");
    
    Scanner x = new Scanner(System.in);
    int altura = x.nextInt();
    
    System.out.print("Introduce un caracter: ");
    String caracter = x.next();
    int espacioInterno = 0;
    
    //Pinta la altura de la piramide
    
    for (int i = 0; i <= altura - 2; i++){
      
      //Pinta espacios externos
      for (int k = 1; k <= altura - i; k++){
        System.out.print(" ");
      }
      //Pinta el caracter
      System.out.print(caracter);
      
      for (int u = 1; u < espacioInterno; u++) {
        System.out.print(" ");
      }
      
      if ((altura > 1) && (i > 0)) {
        System.out.print(caracter);
      }
      System.out.println("");
      espacioInterno += 2;
    }
    //Base
    System.out.print(" ");
    for (int h = 1; h < altura*2; h++) {
      System.out.print(caracter);
    }
  }
}
