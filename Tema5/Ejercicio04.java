/**
 *Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 *utilizando un bucle for .
 *
 * @author Cyntia Garcia Ruiz
 */
public class Ejercicio04{
  public static void main(String[] args) {
  
    System.out.println("Cuenta de 20 en 20 desde 320 hasta 160 ");
    System.out.println("---------------------------------------");
    
    for (int contar = 320 ; contar >= 160; contar -= 20) {
      
      System.out.print(contar + "  ");
    }
  }
}
