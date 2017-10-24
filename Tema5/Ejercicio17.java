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
    Scanner x = new Scanner(System.in);
    
    System.out.print("Introduce un número entero: ");
    int numeroEntero = x.nextInt();
    
    if (numeroEntero >= 0){
      int i = 1;
      int suma = 0;
      do {
        i++;
        suma = suma + numeroEntero;
        numeroEntero++;
      } while (i <= 100);
      System.out.print("Resultado: " + suma);
    } else {
      System.out.println("EL número introducido no es correcto");
    }
  }
}
