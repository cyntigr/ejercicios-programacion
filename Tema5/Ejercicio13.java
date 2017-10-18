/**
 *Escribe un programa que lea una lista de diez números y determine cuántos
 *son positivos, y cuántos son negativos.
 *
 * @author Cyntia Garcia Ruiz
 */
 
 import java.util.Scanner;
 
public class Ejercicio13{
  public static void main(String[] args) {
    
   
    System.out.println("Lista de 10 números");
    System.out.println("-------------------");
    
    System.out.println("Introduce 10 números:");
    Scanner x = new Scanner(System.in);
    
    int cuentaPositivos = 0;
    int lista = 0;
    for (int contar = 1;contar <=10; contar++){
      
      lista = x.nextInt();
      if (lista >= 0){
        cuentaPositivos ++;
      }
    }
    System.out.println("Tengo " + cuentaPositivos + " positivos y " + (10 - cuentaPositivos));
  }
}
