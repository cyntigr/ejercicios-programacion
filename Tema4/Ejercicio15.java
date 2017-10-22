/**
*Escribe un programa que pinte una pirámide rellena con un carácter
*introducido por teclado que podrá ser una letra, un número o un símbolo
*como *, +,-, $, &, etc. El programa debe permitir al usuario mediante 
*un menú elegir si el vértice de la pirámide está apuntando hacia 
*arriba, hacia abajo, hacia la izquierda o hacia la derecha.
*
*
*
* 
*
*@utor Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
  
    Scanner x = new Scanner(System.in);
    System.out.println("Pirámide ");
    System.out.println("---------");
    System.out.println("Introduce el caracter: ");
    
    String p = x.nextLine();
    
    System.out.println("1. Pirámide hacia arriba");
    System.out.println("2. Pirámide hacia abajo");
    System.out.println("3. Pirámide hacia la derecha");
    System.out.println("4. Pirámide hacia la izquierda");
    
    int selec = Integer.parseInt(x.nextLine());
    
    switch (selec) {
      case 1:
      System.out.println("   "+ p);
      System.out.println("  "+ p + p + p);
      System.out.println(" " + p + p + p + p +p);
      System.out.println(p + p + p + p + p + p + p);
      break;
      case 2:
      System.out.println(p + p + p + p + p + p + p);
      System.out.println(" " + p + p + p + p +p);
      System.out.println("  "+ p + p + p);
      System.out.println("   "+ p);
      break;
      case 3:
      System.out.println(p);
      System.out.println(p + p);
      System.out.println(p + p +p);
      System.out.println(p + p + p + p);
      System.out.println(p + p +p);
      System.out.println(p + p);
      System.out.println(p);
      break;
      case 4:
      System.out.println("   "+ p);
      System.out.println("  "+ p + p);
      System.out.println(" "+ p + p +p);
      System.out.println(p + p + p + p);
      System.out.println(" "+ p + p +p);
      System.out.println("  "+ p + p);
      System.out.println("   "+ p);
      break;
      default:
    }
  }
}
