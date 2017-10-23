/**
 *Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while.
 *
 *
 *
 * @author Cyntia Garcia Ruiz
 */
 
public class Ejercicio03{
  public static void main(String[] args) {
  
    System.out.println("Multiplos de 5: ");
    System.out.println("----------------");
    
    int mult = 0;
    
    do {
      System.out.print(mult + "  ");
      mult += 5;
    } while (mult <= 100);
  }
}
