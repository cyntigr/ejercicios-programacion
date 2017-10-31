/**
*
*Escribe un programa que muestre por pantalla todos los números enteros
*positivos menores a uno leído por teclado que no sean divisibles entre otro
*también leído de igual forma.
*
*
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio29{
  public static void main(String[] args) {
    
    System.out.print("Números enteros menores de uno introducido por teclado ");
    System.out.println("y que no son divisibles entre otro número introducido");
    System.out.print("------------------------------------------------------");
    System.out.println("------------------------------------------------------");
    
    System.out.print("Introduce un número entero: ");
    Scanner x = new Scanner(System.in);
    int numero = x.nextInt();
    System.out.print("Introduce otro número: ");
    int noDivisible = x.nextInt();
    
    for (int i = 0 ; i < numero; i++){
      
      if(i % noDivisible != 0){
        System.out.print(i + " ");
      }
    }
  }
}
