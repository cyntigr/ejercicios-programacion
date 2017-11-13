/**
*
*Realiza un programa que muestre al azar el nombre de una carta de la
*baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
*diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
*cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
*sería el 1). Para convertir un número en una cadena de caracteres podemos
*usar String.valueOf(n).
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio01{
  public static void main(String[] args) {
    
    System.out.println("Muestra el nombre de una carta de la baraja francesa");
    System.out.println("----------------------------------------------------");
    
      int numero = (int)(Math.random()*13)+1;
      int palo = (int)(Math.random()*4)+1;
      
      switch(numero){
        case 1: 
          System.out.print("A");
          break;
        case 2:
        case 3: 
        case 4:
        case 5: 
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
          System.out.print(numero);
          break;
        case 11:
          System.out.print("J");
          break;
        case 12: 
          System.out.print("Q");
          break;
        case 13:
          System.out.print("k");
          break;
      }
      switch(palo){
        case 1:
          System.out.print(" Diamantes");
          break;
        case 2:
          System.out.print(" Corazones");
          break;
        case 3:
          System.out.print(" Treboles");
          break;
        case 4:
          System.out.print(" Picas");
          break;
      }
  }
}
