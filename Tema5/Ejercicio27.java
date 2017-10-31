/**
*
*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
*entre 1 y un número leído por teclado.
*
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio27{
  public static void main(String[] args) {
    
    System.out.println("Multiplos de 3, su cuenta y suma");
    System.out.println("-------------------------------");
    
    System.out.print("Introduce un número: ");
    Scanner x = new Scanner(System.in);
    int numero = x.nextInt();
    int cuenta = 0;
    int suma = 0;
    
    for (int i = 1 ; i < numero; i++){
      
      if (i % 3 == 0){
        cuenta++;
        System.out.print(i + " ");
        suma = suma + i;
      }
      
    }
    System.out.println(" ");
    System.out.println(numero + " tiene " + cuenta + " multiplos. Y la suma de ellos es: " + suma);
  }
}
