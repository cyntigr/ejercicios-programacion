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
      mult += 5;
      if ((mult % 5) == 0) { 
      System.out.print(mult + "  ");
      } else {
        System.out.print("Error del programa");
        }
    } while (mult <= 95);
  }
}
