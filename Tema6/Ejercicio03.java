/**
*
*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
*de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio03{
  public static void main(String[] args) {
    
    System.out.println("Muestra el nombre de una carta de la baraja española");
    System.out.println("----------------------------------------------------");
    
      int numero = (int)(Math.random()*10)+1;
      int palo = (int)(Math.random()*4)+1;
      
      switch(numero){
        case 1:
          System.out.print("As");
          break;
        case 2:
        case 3: 
        case 4:
        case 5: 
        case 6:
        case 7:
          System.out.print(numero);
          break;
        case 8:
          System.out.print("Sota");
          break;
        case 9: 
          System.out.print("Caballo");
          break;
        case 10:
          System.out.print("Rey");
          break;
      }
      switch(palo){
        case 1:
          System.out.print(" de Bastos");
          break;
        case 2:
          System.out.print(" de Oros");
          break;
        case 3:
          System.out.print(" de Espadas");
          break;
        case 4:
          System.out.print(" de Copas");
          break;
      }
  }
}
