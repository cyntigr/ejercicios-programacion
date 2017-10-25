/**
*
*Realiza un programa que vaya pidiendo números hasta que se introduzca un
*numero negativo y nos diga cuantos números se han introducido, la media de
*los impares y el mayor de los pares. El número negativo sólo se utiliza para
*indicar el final de la introducción de datos pero no se incluye en el cómputo.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;
 
public class Ejercicio21{
  public static void main(String[] args) {
    System.out.print("Introduce números y calcula la media ");
    System.out.println("de los impares y dime el mayor par");
    System.out.print("-----------------------------------");
    System.out.println("------------------------------------");
    
    System.out.println("Introduce un número: ");
    
    int suma = 0;
    int contar = -1;
    int contarImpar = 0;
    int mayorPar = 0;
    int num = 0;
    do{
      Scanner x = new Scanner(System.in);
      num = x.nextInt();
      //Identifica impar y suma
      if (num % 2 != 0){
        suma += num;
        contarImpar++;
      } else{
          if(num > mayorPar){
            mayorPar = num;
          }
        }
      //Cuenta los numeros
      contar++;
    } while(num > 0);
    System.out.println("La cantidad de números introducidos es: " + contar);
    System.out.println("La media de los números impares es: " + suma/contar);
    System.out.println("El mayor de los pares es: " + mayorPar);

    

  }
}
