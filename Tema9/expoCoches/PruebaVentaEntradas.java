package expoCoches;

import java.util.Scanner;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class PruebaVentaEntradas {

  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int respuesta;
    int n = 0;
    int opcion = 0;
    
    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    do {
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      
      respuesta = x.nextInt();
      switch (respuesta) {
        case 1:
          System.out.println("¿Que zona quieres?");
          System.out.println("1. Sala principal");
          System.out.println("2. Compra-Venta");
          System.out.println("3. Vip");
          opcion = x.nextInt();
          switch (opcion) {
            case 1:
              System.out.println(salaPrincipal.getEntradasPorVender());
              break;
            case 2:
              System.out.println(compraVenta.getEntradasPorVender());
              break;
            case 3:
              System.out.println(vip.getEntradasPorVender());
              break;
            default:
          }
          break;
        case 2:
          System.out.println("¿En que zona quieres las entradas?");
          System.out.println("1. Sala principal");
          System.out.println("2. Compra-Venta");
          System.out.println("3. Vip");
          opcion = x.nextInt();
          System.out.println("¿Cuantas entradas quieres?");
          n = x.nextInt();
          switch (opcion) {
            case 1:
              salaPrincipal.vender(n);
              break;
            case 2:
              compraVenta.vender(n);
              break;
            case 3:
              vip.vender(n);
              break;
            default:
          }
          break;
        case 3:
          System.out.println("Has salido exitosamente.");
          break;
        default:
      }

    } while (respuesta != 3);
  }

}
