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
    String nombreDia;
    
    switch (dia) {
      case 1:
        nombreDia = "Lunes";
        break;
      case 2:
        nombreDia = "Martes";
        break;
      case 3:
        nombreDia = "Miércoles";
        break;
      case 4:
        nombreDia = "Jueves";
        break;
      case 5:
        nombreDia = "Viernes";
        break;
      case 6:
        nombreDia = "Sábado";
        break;
      case 7:
        nombreDia = "Domingo";
        break;
      default:
        nombreDia = "Ese dia no es correcto, vuelve a intentarlo.";
    }
    System.out.print("Dia " + dia + ": " + nombreDia);
  }
}
