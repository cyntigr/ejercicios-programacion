/**
*Escribe un programa que pida por teclado un día de la semana y que diga qué
*asignatura toca a primera hora ese día.
*
* 
* 
*@utor Cyntia Garcia
*/
 
import java.util.Scanner;


public class Ejercicio01 {
  public static void main(String[] args) {
  
  Scanner dia = new Scanner(System.in);
  
  System.out.print("Introduce día de la semana : ");
  
    String diaSemana = dia.nextLine().toLowerCase();
    
  System.out.print("Este día tenemos:");
  
    switch (diaSemana) {
    
      case "lunes":
        System.out.println("Programación BBDD");
        break;
      
      case "martes":
        System.out.println("Sistemas Lenguaje M. Programación");
        break;
      
      case "miércoles":
        System.out.println("Programación BBDD");
        break;
      
      case "jueves":
        System.out.println("Entornos Lenguaje M.");
        break;
      
      case "viernes":
        System.out.println("Sistemas Formación");
        break;
      
      case "sabado":
        System.out.println("Descanso");
        break;
      
      case "domingo":
        System.out.println("Descanso");
        break;
      
      default:
        System.out.println("Lo siento la entrada es erronea, introduzca un día.");
        break;
    }
  }
}
