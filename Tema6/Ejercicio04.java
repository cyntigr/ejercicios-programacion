/**
*
*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) sepa-
*rados por espacios.
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio04{
  public static void main(String[] args) {
    
    System.out.println("Muestra 20 números enteros entre el 0 y el 10 ambos incluidos");
    System.out.println("-------------------------------------------------------------");
    
    for(int i=1;i<=20;i++){
      int numero = (int)(Math.random()*11);
      System.out.print(numero + " ");
    }
      
  }
}
