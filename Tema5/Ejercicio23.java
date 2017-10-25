/**
*
*Escribe un programa que permita ir introduciendo una serie indeterminada
*de números mientras su suma no supere el valor 10000. Cuando esto último
*ocurra, se debe mostrar el total acumulado, el contador de los números
*introducidos y la media.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;
 
public class Ejercicio23{
  public static void main(String[] args) {
    System.out.println("Muestra los números primos entre 2 y 100 ambos incluidos.");
    System.out.println("---------------------------------------------------------");
    
    System.out.println("Introduce un número: ");
    
    int suma = 0;
    int contar = 0;
    int num = 0;
    
    do{
      Scanner x = new Scanner(System.in);
      num = x.nextInt();
      suma += num;
      contar++;
    } while(suma < 10000);
    System.out.println("La cantidad de números introducidos es: " + contar);
    System.out.println("Suma de todos los números: " + suma);
    System.out.println("La media de todos los números es: " + suma/contar);
    

    

  }
}
