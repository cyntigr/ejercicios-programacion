/**
 *Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Cyntia Garcia Ruiz
 */
 
 import java.util.Scanner;
 
public class Ejercicio08{
  public static void main(String[] args) {
  
    System.out.println("Tablas de multiplicar");
    System.out.println("---------------------");
    
    System.out.println("Introduce un numero para saber su tabla:");
    Scanner x = new Scanner(System.in);
    
    int y = Integer.parseInt(x.nextLine()) ;
    
    for (int mult = 0; mult <= 10; mult++) {
      
      System.out.println( y + " x " + mult + " = " + (y * mult));
    }
  }
}
