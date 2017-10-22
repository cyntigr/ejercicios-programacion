/**
 *Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 *utilizando un bucle for .
 *
 * @author Cyntia Garcia Ruiz
 */
public class Ejercicio06{
  public static void main(String[] args) {
  
    System.out.println("Cuenta de 20 en 20 desde 320 hasta 160 ");
    System.out.println("---------------------------------------");
    
    int contar = 340 ;
    do {
      contar -= 20;
      System.out.print(contar + "  ");
    }
    
    while (contar >= 180);
  }
}
