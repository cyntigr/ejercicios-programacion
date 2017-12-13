/*
 * Escribe un programa que rellene un array de 100 elementos con números ente-
 * ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int[] num = new int[100];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    for (int i = 0; i < 100; i++) {
      num[i] = (int) (Math.random() * 500);
     
    }
    for (int i = 0; i < 100; i++) {
      System.out.print(num[i] + " ");
      if(num[i]<minimo){
            minimo = num[i];
      }
      if(num[i]>maximo){
        maximo=num[i];
      }
    }
    System.out.println(" ");
    System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    
    int opcion = x.nextInt();
    
    switch(opcion){
      case 1:
        for (int i = 0; i < 100; i++) {
          if(minimo == num[i]){
            System.out.print("**" + num[i] + "**");
          }else {
            System.out.print(num[i] + " ");
          }
        }
        break;
      case 2:
        for (int i = 0; i < 100; i++) {
          if(maximo == num[i]){
            System.out.print("**" + num[i] + "**");
          }else {
            System.out.print(num[i] + " ");
          }
        }
        break;
    }

  }
}
