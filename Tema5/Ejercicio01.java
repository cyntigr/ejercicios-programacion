/**
 *Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
 *
 * @author Cyntia Garcia Ruiz
 */
public class Ejercicio01{
  public static void main(String[] args) {
    System.out.println("Multiplos de 5: ");
    System.out.println("----------------");
    
    for (int mult = 0; mult <= 100; mult += 5) {
        System.out.print("  " + mult);
    }
  }
}
