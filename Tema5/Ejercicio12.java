/**
*Escribe un programa que muestre los n primeros términos de la serie de
*Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
*y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
*los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
*debe introducir por teclado.
*
* @author Cyntia Garcia Ruiz
*/
 
import java.util.Scanner;
 
public class Ejercicio12{
  public static void main(String[] args) {
    
    System.out.println("Serie de Fibonacci");
    System.out.println("------------------");
    Scanner x = new Scanner(System.in);
    int n = x.nextInt();
    int ultimo = 1;
    int penultimo = 0;
    int serie = 0;
    
    System.out.print(penultimo + (" ") + ultimo);
    for (int i = 1; i <= n - 2; i++) {
      
      serie = ultimo + penultimo;
      penultimo = ultimo;
      ultimo = serie;
      
      System.out.print((" ") + serie);
      
    }
    
  }
}
