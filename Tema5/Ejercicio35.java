/**
*
*Realiza un programa que pinte una X hecha de asteriscos. El programa debe
*pedir la altura. Se debe comprobar que la altura sea un número impar mayor
*o igual a 3, en caso contrario se debe mostrar un mensaje de error.
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio35{
  public static void main(String[] args) {
    
    System.out.println("Pinta una X por pantalla");
    System.out.println("------------------------");
    
    System.out.print("Introduce la altura de la X: ");
    
    Scanner x = new Scanner(System.in);
    int altura = x.nextInt();
    int espaciosDelante = 0;
    int espaciosDetras = 0;
    int alturaCentral = 0;
    int espaciosDelanteDos = 0;
    int espaciosDetrasDos = 0;
    int alturaCentralDos = 0;
    
    if((altura >= 3) && ((altura % 2) != 0)){
    
      for(int j=0 ; j <= ((altura-2)/2); j++){
        //primer triangulo x
        for(int i= 0; i <= espaciosDelante;i++){
          System.out.print(" ");
        }
        //PALO 2
        System.out.print("*");
        
        //ESPACIOS DETRAS
        for(int k = altura - 2; k > espaciosDetras;k--){
          System.out.print(" ");
        }
        //PALO 3
        System.out.print("*");
        
        //IMPORTANTE PONER QUE SE AUMENTE AL FINAL DEL BUCLE
        espaciosDelante++;
        espaciosDetras+=2;
        alturaCentral++;
        System.out.println("");
      }
      //centro de x
      for(int p=0 ; p <= ((altura-1)/2); p++){
        System.out.print(" ");
      }
      System.out.println("*");
      
      for(int j=0 ; j <= ((altura-2)/2); j++){
        //ESPACIOS DETRAS 
        for(int k = ((altura-1)/2); k > espaciosDetrasDos;k--){
          System.out.print(" ");
        }
        //PALO 3
        System.out.print("*");
        
        //segundo triangulo x
        for(int i= 0; i <= espaciosDelanteDos;i++){
          System.out.print(" ");
        }
        //PALO 2
        System.out.print("*");
        
        
        
        //IMPORTANTE PONER QUE SE AUMENTE AL FINAL DEL BUCLE
        espaciosDelanteDos+=2;
        espaciosDetrasDos++;
        alturaCentralDos++;
        System.out.println("");
      }
    
    } else {
        System.out.print("Lo siento tiene que ser un número impar para poder hacer la X.");
      }
  }
}
