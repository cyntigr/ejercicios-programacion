/**
*
*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
*también la suma total (los puntos que suman entre los tres dados).
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio01{
  public static void main(String[] args) {
    
    System.out.println("Muestra la tirada de 3 dados y la suma de los números");
    System.out.println("-----------------------------------------------------");
    
    int suma = 0;
    
    for(int i=1; i<=3;i++){
      int numero = (int)(Math.random()*6)+1;
      System.out.print(numero + " ");
      suma += numero;
    }
    System.out.print("La suma de estos 3 números es: " + suma);
  }
}
