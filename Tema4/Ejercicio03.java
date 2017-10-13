/**
*
*Escribe un programa en que dado un número del 1 a 7 escriba el
*corespondiente nombre del día de la semana.
* 
* 
*@utor Cyntia Garcia
*/
 
import java.util.Scanner;


public class Ejercicio03 {
  public static void main(String[] args) {
  
  Scanner x = new Scanner(System.in);
  
  System.out.print("Introduce el numero de día del 1 al 7: ");
    
    int dia = Integer.parseInt(x.nextLine()) ;
    
    if (dia = 1) {
      System.out.println("Es Lunes");
    }
    if (dia.equals(2)) {
      System.out.println("Es Martes");
    }
    if (dia.equals(3)) {
      System.out.println("Es Miércoles");
    }
    if (dia.equals(4)) {
      System.out.println("Es Jueves");
    }
    if (dia.equals(5)) {
      System.out.println("Es Viernes");
    }
    if (dia.equals(6)) {
      System.out.println("Es Sábado");
    }
    if (dia.equals(7)) {
      System.out.println("Es Domingo");
    }
    else { 
      System.out.print("Lo siento ese día no es correcto. Vuelve a intentarlo");
    }
  }
}
