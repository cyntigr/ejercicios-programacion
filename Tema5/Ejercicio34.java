/**
*
*
*Escribe un programa que pida dos números por teclado y que luego mezcle en
*dos números diferentes los dígitos pares y los impares. Se van comprobando
*los dígitos de la siguiente manera: primer dígito del primer número, primer
*dígito del segundo número, segundo dígito del primer número, segundo
*dígito del segundo número, tercer dígito del primer número... Para facilitar
*el ejercicio, podemos suponer que el usuario introducirá dos números de la
*misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
*long en lugar de int donde sea necesario para admitir números largos.
* 
*
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio34{
  public static void main(String[] args) {
    
    System.out.print("Vamos a mezclar dos números introducidos por");
    System.out.println("teclado en uno los pares y en otro los impares");
    System.out.print("----------------------------------------------");
    System.out.println("--------------------------------------------");
    
    System.out.print("Introduce un número: ");
    Scanner x = new Scanner(System.in);
    long numero = x.nextLong();
    
    System.out.print("Introduce otro número: ");
    long numeroDos = x.nextLong();
    
    long numeroPrincipio = numero;
    long vuelta = 0;
    long numeroIntroducidoDos = numeroDos;
    long vueltaDos = 0;
    
    //Damos la vuelta al numero 1
    while (numeroPrincipio > 0) {
      vuelta = (vuelta * 10) + (numeroPrincipio % 10);
      numeroPrincipio = numeroPrincipio / 10;
    }
    //Damos la vuelta al numero 2
    while (numeroIntroducidoDos > 0) {
      vueltaDos = (vueltaDos * 10) + (numeroIntroducidoDos % 10);
      numeroIntroducidoDos = numeroIntroducidoDos / 10;
    }
    
    long ultimaCifraUna = 0;
    long ultimaCifraDos = 0;
    long vueltaPar = vuelta;
    long vueltaParDos = vueltaDos;
    //Comprobamos los pares
    System.out.print("El número formado por las cifras pares es: ");
     do {
          ultimaCifraUna = vueltaPar % 10;
          ultimaCifraDos = vueltaParDos % 10;
          if (ultimaCifraUna % 2 == 0){
            System.out.print(ultimaCifraUna);
          }
          if (ultimaCifraDos % 2 == 0){
            System.out.print(ultimaCifraDos);
          }
          vueltaPar = vueltaPar / 10;
          vueltaParDos = vueltaParDos / 10;
        } while (vueltaPar > 0 || vueltaParDos > 0);
    
    System.out.println("");
    //Comprobamos impares
    System.out.print("El número formado por las cifras impares es: ");
    do {
      ultimaCifraUna = vuelta % 10;
      ultimaCifraDos = vueltaDos % 10;
      if (ultimaCifraUna % 2 != 0){
        System.out.print(ultimaCifraUna);
      }
      if (ultimaCifraDos % 2 != 0){
        System.out.print(ultimaCifraDos);
      }
      vuelta = vuelta / 10;
      vueltaDos = vueltaDos / 10;
    } while (vuelta > 0 || vueltaDos > 0);
    
  }
}
