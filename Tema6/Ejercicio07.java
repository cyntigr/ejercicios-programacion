/**
*
*
*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
*para los 14 partidos y el pleno al quince (15 filas)
*
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio07{
  public static void main(String[] args) {
    
    System.out.println("Resultado de 3 columnas de la quiniela");
    System.out.println("--------------------------------------");
    int cuenta = 0;
    int numero = 0;
    System.out.println("Columna 1  Columna 2 Columna 3");
    do{
      for(int i = 1; i <=3;i++){
        System.out.print("     ");
        numero = (int)(Math.random()*3);
        if(numero == 0){
          System.out.print("x ");
        } else{
            System.out.print(numero + " ");
          }
      }
      System.out.println(" ");
      cuenta++;
    } while(cuenta < 14);
    numero = (int)(Math.random()*3);
    System.out.print("Pleno al 15: ");
    if(numero == 0){
          System.out.print("x ");
        } else{
            System.out.print(numero + " ");
          }
  }
}
