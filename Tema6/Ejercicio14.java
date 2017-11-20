package tema6;

/*
 * 
 *Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 *El programa intentará adivinar el número que estás pensando - un número
 *entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 *programa debe preguntar si el número que estás pensando es mayor o menor
 *que el que te acaba de decir.
 *
 *
 */
/**
 *
 * @author Cintia Garcia Ruiz
 */
import java.util.Scanner;

public class Ejercicio14 {

  public static void main(String[] args) {
    System.out.println("Piensa un número al azar entre 0 y 100, la maquina tiene 5 oportunidades");
    System.out.println("------------------------------------------------------------------------");
    int cuenta = 0;
    int oportunidades = 4;
    String oportunidad;
    int numeroPensado;
    boolean seguir = true;
    String mayorOMenor;
    int limiteSuperior = 100;
    int limiteInferior = 1;
    do {
      numeroPensado = (int) (Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior;
      System.out.println("Es este el número que estas pensando? " + numeroPensado);
      System.out.print("Dime si o no: ");
      System.out.println(" ");
      Scanner x = new Scanner(System.in);
      oportunidad = x.nextLine();
      
      if (oportunidad.equals("no")) {
        seguir = true;
        System.out.println("El número que estas pensando es mayor o es menor que el " + numeroPensado + " ?");
        mayorOMenor = x.nextLine();
        if (mayorOMenor.equals("menor")) {
          limiteSuperior = numeroPensado - 1;
        } else {
          limiteInferior = numeroPensado + 1;
        }
        System.out.println("Quedan " + oportunidades + " intentos.");
        System.out.println("Este es el limiteSuperior " + limiteSuperior);
        System.out.println("Este es el limiteInferior " + limiteInferior);
      } else {
        seguir = false;
          System.out.println("Es correcto el número");
        }
      System.out.println(" ");
      oportunidades--;
      cuenta++;
    } while ((cuenta < 5) && (seguir == true));
  }

}
