/**
*
*Escribe un programa que diga si un número introducido por teclado es o no
*primo. Un número primo es aquel que sólo es divisible entre él mismo y la
*unidad.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;
 
public class Ejercicio16{
  public static void main(String[] args) {
    
   
   
    System.out.println("Comprueba si es número primo ");
    System.out.println("-----------------------------");
    
    System.out.println("Introduce el número: ");
    
    Scanner x = new Scanner(System.in);
    
    int num = x.nextInt();
    int divi = 0;
    
    for (int i = 2; i <= num; i++){
      divi = num % i;
    }
    if ((divi == 0) && (num != 2)) {
        System.out.print("No es número primo");
    } else {
        System.out.print("Es numero primo");
        }
  }
}
