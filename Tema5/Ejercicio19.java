/**
*
*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
*pedir por teclado. El carácter con el que se pinta la pirámide también se debe
*pedir por teclado.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;
 
public class Ejercicio19{
  public static void main(String[] args) {
    
    System.out.println("Pinta una pirámide con altura y caracter dado.");
    System.out.println("----------------------------------------------");
    
    System.out.print("Introduce un número: ");
    
    Scanner x = new Scanner(System.in);
    int altura = x.nextInt();
    
    System.out.print("Introduce un caracter: ");
    String caracter = x.next();
    
    //Pinta la altura de la piramide
    for (int i = 0; i <= altura - 1; i++){
      //Pinta espacios
      for (int k = 1; k <= altura - i; k++){
        System.out.print(" ");
      }
      //Pinta el caracter
      for (int j = 1; j <= 2*i+1; j++){
        System.out.print(caracter);
      }
      System.out.println("");
    }
  }
}
