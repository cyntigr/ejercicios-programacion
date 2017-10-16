/**
*Escribe un programa que dada una hora determinada (horas y minutos),
*calcule los segundos que faltan para llegar a la medianoche.
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Cálculo de los segundos que faltan para media noche:");
    System.out.println("----------------------------------------------------");
    
    System.out.print("Escribe la hora: ");
    
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escribe los minutos: ");
    
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundos = ((hora * 60) * 60) + (minutos * 60);
    int segundosMediaNoche = 86400 - segundos;
    
    System.out.print("Quedan " + segundosMediaNoche + " segundos para la media noche");
  }
}
