/**
 *Escribe un programa que dados dos números, uno real (base) y un entero
 *positivo (exponente), saque por pantalla todas las potencias con base el
 *numero dado y exponentes entre uno y el exponente introducido. No se deben
 *utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 *se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 *
 * @author Cyntia Garcia Ruiz
 */
 
 import java.util.Scanner;
 
public class Ejercicio15{
  public static void main(String[] args) {
    
   
   
    System.out.println("EXPONENTES");
    System.out.println("----------");
    
    System.out.println("Introduce base y exponente:");
    
    Scanner x = new Scanner(System.in);
    
    int ba = x.nextInt();
    int exponente = x.nextInt();
    int total = 1;
    
    for (int contar = 1; contar <= exponente; contar++){
      
      System.out.println(ba + " " + contar);
      total = total * ba;
      
    }
  }
}
