/**
*
*Examen 01 programación,08-11-2017.
*El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que
*encuentre). Realiza un programa que muestre un número antes y después de haber sido comido por
*el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
*
*
* @author Cintia Garcia Ruiz
* 1ºDAM
* 
*/

import java.util.Scanner;
 
public class Ex09cgr4{
  public static void main(String[] args) {
  
    Scanner x = new Scanner(System.in);
    System.out.print("Introduzca un número entero (mayor que cero): ");
    int numero = x.nextInt();
    
    int numeroPrincipio = numero;
    int vuelta = 0;
    int otro = 0;
    
    while (numeroPrincipio > 0) {
      
      vuelta = numeroPrincipio % 10;
      //damos la vuelta y quitamos los 8 y 0
      if((vuelta == 8) || (vuelta == 0)){
        numeroPrincipio /= 10;
      } else{
          otro = (otro * 10) + (numeroPrincipio % 10);
          numeroPrincipio /= 10;
        }
    }
    //damos la vuelta al numero volteado sin 0 y 8
    int volteado = otro;
    int pruebaVuelta = volteado;
    int derecho = 0;
      
    while (pruebaVuelta > 0) {
      derecho = (derecho * 10) + (pruebaVuelta % 10);
      pruebaVuelta /= 10;
    }
    System.out.print("Después de haber sido comido por el gusano numérico se queda en " + derecho);
  }
}
