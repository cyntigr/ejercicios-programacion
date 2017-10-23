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
    int incremento = 1;
    
    if (num < 0){
      num = num * (-1);
    }
    while (num > 9) {
      num = num / 10;
      incremento++;
    }
    System.out.print("El número introducido tiene " + incremento + " cifras.");
  }
}
