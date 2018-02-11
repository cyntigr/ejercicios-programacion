/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class PruebaVehiculo {

  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    Bicicleta uno = new Bicicleta("carbono", "blanca", "montaña", 2);
    Coche dos = new Coche("cuero", "negro", "ford", 4, 6);

    int respuesta;
    int kilometros;

    do {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir ");
      System.out.println("Elige una opción (1-8): ");
      respuesta = x.nextInt();
      switch (respuesta) {
        case 1:
          System.out.println("Cuantos kilometros quieres andar: ");
          kilometros = x.nextInt();
            uno.anda(kilometros);
          break;
        case 2:
          uno.caballito();
          break;
        case 3:
          System.out.println("Cuantos kilometros quieres andar: ");
          kilometros = x.nextInt();
            dos.anda(kilometros);
          break;
        case 4:
          dos.quemaRueda();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos: ");
          System.out.println(uno.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos: ");
          System.out.println(dos.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Kilometros totales de los vehiculos");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
          break;
        case 8:
          System.out.println("Has salido exitosamente");
          break;
        default:
      }

    } while (respuesta != 8);
  }

}
