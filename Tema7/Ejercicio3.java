/*
 * 
 *
 *Escribe un programa que lea 10 números por teclado y que luego los muestre
 *en orden inverso, es decir, el primero que se introduce es el último en
 *mostrarse y viceversa.
 *
 *
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int[] num;
    System.out.println("Introduce 10 números para almacenar: ");
    num = new int[10];
    for(int i=0;i<10;i++){
      num[i] = x.nextInt();
    }
    for(int i=9;i>=0;i--){
      System.out.println(num[i] + " ");
    }
    
  }
}
