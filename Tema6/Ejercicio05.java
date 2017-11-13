/**
*
*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
*separados por espacios. Muestra también el máximo, el mínimo y la media
*de esos números.
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio05{
  public static void main(String[] args) {
    
    System.out.println("Muestra 50 números enteros entre el 100 y 199 ambos incluidos");
    System.out.println("-------------------------------------------------------------");
    
    int suma = 0;
    int division = 0;
    int maximo = 0;
    int minimo = 99999;
    
    for(int i=1;i<=50;i++){
      int numero = (int)(Math.random()*100)+100;
      System.out.print(numero + " ");
      suma += numero;
      division++;
      
      if(numero > maximo){
        maximo = numero;
      }
      if(numero < minimo){
        minimo = numero;
      }
    }
    System.out.println(" ");
    System.out.println("La media de los números es: " + (suma/division));
    System.out.println("El maximo de los números es: " + maximo);
    System.out.println("El minimo de los números es: " + minimo);
    
      
  }
}
