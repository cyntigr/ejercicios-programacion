/**
*
* Examen 02 programación,04-12-2017.
* Realiza un programa que genere 20 números aleatorios entre 2 y 100. A continuación, el programa
* deberá mostrar un listado con todos los números primos encontrados. Si no existiera ningún primo, el
* programa deberá mostrar el mensaje “No se ha encontrado ningún número primo.”
*
* @author Cintia Garcia Ruiz
* 1ºDAM
* 
*/

import java.util.Scanner;
 
public class Ex09cgr1{
  public static void main(String[] args) {
  
    int[] num = new int[20];
    int[] auxiliar = new int[20];
    int cuentaPrimo = 0;
    int[] auxiliarNoPrimo = new int[20];
    int cuentaNoPrimo = 0;
    int divi = 0;
    System.out.println("Array de tamaño 20 con números aleatorios entre 2 y 100, mostramos solo los primos.");
    for (int i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 199)+2;
      divi = 0;
      for (int j = 2; j < num[i]; j++) {
        if (num[i] % j == 0) {
          divi = 1;
        }
      }
      if (divi == 1) {
        auxiliarNoPrimo[cuentaNoPrimo++] = num[i];
      } else {
        auxiliar[cuentaPrimo++] = num[i];
        }
    }
    System.out.println(" ");
    for (int i = 0; i < 20; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println(" ");
    if(cuentaPrimo != 0){
      System.out.print("Números primos encontrados: ");
      for (int i = 0; i < cuentaPrimo; i++) {
        System.out.print(auxiliar[i] + " ");
      }
    } else{
        System.out.print("No se ha encontrado ningun número primo.");
      }

      
  }
}
