/**
*
*Realiza una programa que calcule las horas transcurridas entre dos horas de
*dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
*El día de la semana se puede pedir como un número (del 1 al 7) o como una
*cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
*los datos correctamente y que el segundo día es posterior al primero.
*
*
* @author Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio30{
  public static void main(String[] args) {
    
    System.out.println("Calcularemos las horas transcurridas entre dos dias de la semana");
    System.out.println("----------------------------------------------------------------");
    
    int primerDia = 0;
    int primeraHora = 0;
    String nombrePrimerDia = "";
    String nombreSegundoDia = "";
    int horasTranscurridas = 0;
    int segundoDia = 0;
    int segundaHora = 0;
    int dias = 7;
    do{
    System.out.print("Introduce un día de la semana con un número del 1 al 7: ");
    Scanner x = new Scanner(System.in);
    primerDia = x.nextInt();
    
    System.out.print("Introduce una hora desde las 1 a las 24: ");
    primeraHora = x.nextInt();

    switch(primerDia) {
        case 1:
          primerDia = 24;
          nombrePrimerDia = "lunes";
          break;
        case 2:
          primerDia = 48;
          nombrePrimerDia = "martes";
          break;
        case 3:
          primerDia = 72;
          nombrePrimerDia = "miercoles";
          break;
        case 4:
          primerDia = 96;
          nombrePrimerDia = "jueves";
          break;
        case 5:
          primerDia = 120;
          nombrePrimerDia = "viernes";
          break;
        case 6:
          primerDia = 144;
          nombrePrimerDia = "sábado";
          break;
        case 7:
          primerDia = 168;
          nombrePrimerDia = "domingo";
          break;
        default:
          primerDia = 0;

      }
      
    System.out.print("Introduce el siguiente día también con número: ");
    segundoDia = x.nextInt();
    
    System.out.print("Introduce la hora igual que antes: ");
    segundaHora = x.nextInt();
    
        switch(segundoDia) {
        case 1:
          segundoDia = 24;
          nombreSegundoDia = "lunes";
          break;
        case 2:
          segundoDia = 48;
          nombreSegundoDia = "martes";
          break;
        case 3:
          segundoDia = 72;
          nombreSegundoDia = "miercoles";
          break;
        case 4:
          segundoDia = 96;
          nombreSegundoDia = "jueves";
          break;
        case 5:
          segundoDia = 120;
          nombreSegundoDia = "viernes";
          break;
        case 6:
          segundoDia = 144;
          nombreSegundoDia = "sábado";
          break;
        case 7:
          segundoDia = 168;
          nombreSegundoDia = "domingo";
          break;
        default:
          segundoDia = 0;
      }
      horasTranscurridas = segundoDia - primerDia - primeraHora + segundaHora;
      
    if (segundoDia <= primerDia) {
        System.out.println("El segundo dia debe ser mayor que el primero.");
    }
    if ((primerDia == 0) || (segundoDia == 0)){
        System.out.println("El dia debe estar entre 1 y 7.");
    }
    if ((primeraHora < 1) || (primeraHora > 24) || (segundaHora < 1) || (segundaHora > 24)) {
        System.out.println("No se ha introducido correctamente la hora del día.");
        System.out.println("Las horas válidas están entre 1 y 24.");
    }
    
    
      
    }while(!(primerDia < segundoDia) && (primeraHora > segundaHora));
    
    System.out.print("Desde el " + nombrePrimerDia + " a las " + primeraHora);
    System.out.print(" hasta el " + nombreSegundoDia + " a las " + segundaHora);
    System.out.println(" han pasado " + horasTranscurridas + " horas." );
      
      
    
    
  }
}
