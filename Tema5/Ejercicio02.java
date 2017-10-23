/**
 *Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 *
 *
 *
 * @author Cyntia Garcia Ruiz
 */
 
public class Ejercicio02{
  public static void main(String[] args) {
  
    System.out.println("Multiplos de 5: ");
    System.out.println("----------------");
    
    int mult = 0;
    
    while (mult <= 100) {
      
      System.out.print(mult + "  ");
      mult += 5;
    }
  }
}
