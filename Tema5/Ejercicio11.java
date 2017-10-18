/**
 *Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 *los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 *
 *
 * @author Cyntia Garcia Ruiz
 */
 
 import java.util.Scanner;
 
public class Ejercicio11{
  public static void main(String[] args) {
  
    System.out.println("CUADRADO Y CUBO");
    System.out.println("---------------------");
    
    System.out.println("Introduce un número:");
    Scanner x = new Scanner(System.in);
    
    int y = Integer.parseInt(x.nextLine()) ;
    
    for (int n = y ; n < y + 5 ; n++) {
      
      System.out.printf("%4d %6d %8d \n", n, n * n, n * n * n);
    }
  }
}
