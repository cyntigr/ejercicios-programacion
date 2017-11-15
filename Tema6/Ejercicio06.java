/**
*
*Escribe un programa que piense un número al azar entre 0 y 100. El usuario
*debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
*fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
*ducido es menor o mayor que el número secreto.
*
* 
* 
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio06{
  public static void main(String[] args) {
    
    System.out.println("Piensa un número al azar entre 0 y 100, tienes 5 oportunidades");
    System.out.println("--------------------------------------------------------------");
    int cuenta = 0;
    int oportunidades = 5;
    int oportunidad = 0;
    int numero = (int)(Math.random()*100);
    System.out.println("Adivina el número de 0 a 100 que ha pensado la máquina");

    do{
      System.out.print("Introduce el número elegido: ");
      Scanner x = new Scanner(System.in);
      oportunidad = x.nextInt();
      oportunidades--;
      if((numero < oportunidad) && (oportunidades > 0)){
        System.out.println("El número es menor que el introducido");
      }
      if((numero > oportunidad) && (oportunidades > 0)){
        System.out.println("El número es mayor que el introducido");
      }
      if(numero == oportunidad){
        System.out.print("Has acertado");
      } else{
          System.out.println("Quedan " + oportunidades + " intentos.");
        }
      System.out.println(" ");
      cuenta++;
    } while((cuenta < 5) && (numero != oportunidad));
    
  }
}
