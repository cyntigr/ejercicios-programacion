/**
 *Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 *por teclado.
 *
 * @author Cyntia Garcia Ruiz
 */
 
 import java.util.Scanner;
 
public class Ejercicio09{
  public static void main(String[] args) {
    System.out.println("Cuantos digitos tiene un número");
    System.out.println("-------------------------------");
    Scanner x = new Scanner(System.in);
    
    int num = x.nextInt();
    int i = 1;
    
    while (num > 9) {
      num = num / 10;
      i++;
    }
    System.out.print("El número introducido tiene " + i + " cifras.");
  }
}
