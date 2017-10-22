/**
*Escribe un programa que diga cuál es la primera cifra de un número entero
*introducido por teclado. Se permiten números de hasta 5 cifras.
* 
*
*@utor Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
  
    Scanner x = new Scanner(System.in);
    System.out.println("Número que quieres te diga la primera cifra, maximo 5 cifras: ");
    System.out.println("--------------------------------------------------------------");
    
    System.out.println("Introduce el numero: ");
    int num = x.nextInt();
    
    if (num < 10){ 
      System.out.print("El primer numero es: " + num );
    } else {
        if ((num >= 10) && (num <= 99)){ 
        System.out.print("El primer numero es: " + num / 10 );
        } else {
            if ((num >= 100) && (num <= 999)){ 
            System.out.print("El primer numero es: " + num / 100 );
            } else { 
                if ((num >= 1000) && (num <= 9999)){ 
                System.out.print("El primer numero es: " + num / 1000 );
                } else {
                    if ((num >= 10000) && (num <= 99999)){ 
                    System.out.print("El primer numero es: " + num / 10000 );
                    } else {
                      System.out.print("Número incorrecto vuelva a intentarlo");
                      }
                  }
              }
          }
      }
  }
}
