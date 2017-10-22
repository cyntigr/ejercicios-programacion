/**
*
*Realiza un programa que sume los 100 números siguientes a un número entero
*y positivo introducido por teclado. Se debe comprobar que el dato introducido
*es correcto (que es un número positivo).
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;
 
public class Ejercicio17{
  public static void main(String[] args) {
    
   
   
    System.out.println("Suma de los 100 números siguientes");
    System.out.println("----------------------------------");
    
    System.out.println("Introduce el número: ");
    
    Scanner x = new Scanner(System.in);
    
    int num = x.nextInt();
    
    int total = 0;
    
    for (int i = num ; i == num +  100 ; i++){
    total += i;
    }
    System.out.print("RESULTADO SUMA: " + total);
  }
}
