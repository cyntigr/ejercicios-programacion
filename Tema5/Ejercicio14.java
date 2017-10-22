/**
 *Escribe un programa que pida una base y un exponente (entero positivo) y
 *que calcule la potencia.
 *
 * @author Cyntia Garcia Ruiz
 */
 
 import java.util.Scanner;
 
public class Ejercicio14{
  public static void main(String[] args) {
    
   
    System.out.println("EXPONENTES");
    System.out.println("----------");
    
    System.out.println("Introduce base y exponente:");
    
    Scanner x = new Scanner(System.in);
    
    int ba = x.nextInt();
    int exponente = x.nextInt();
    int total = 1;
    
    for (int contar = 1; contar <= exponente; contar++){
      
      total = total * ba;
      
    }
    System.out.println("Total: " + total);
  }
}
