/**
 *Escribe un programa que calcule la media de un conjunto de números positivos
 *introducidos por teclado. A priori, el programa no sabe cuántos números se
 *introducirán. El usuario indicará que ha terminado de introducir los datos
 *cuando meta un número negativo.
 *
 * @author Cyntia Garcia Ruiz
 */
 
 import java.util.Scanner;
 
public class Ejercicio10{
  public static void main(String[] args) {
    
    System.out.println("Cálculo de la media");
    System.out.println("-------------------");
    
    int num = 0;
    int division = 0;
    int suma = 0;
    
    while (num >= 0) {
      Scanner x = new Scanner(System.in);
      num = x.nextInt();
      if (num >= 0){
      suma = num + suma;
      division++;}
    }
    System.out.printf("La media es: %.2f",(double)suma/division);
  }
}
