package tema8ejercicios;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;
import tema8ejercicios.matematicas.Ejercicios1a14;

public class Ejercicio18 {

  public static void main(String[] args) {

    Scanner x = new Scanner(System.in);
    System.out.println("Introduzca un número entero: ");
    int decimal = x.nextInt();
    if (decimal != 1) {
      int binario = 0;
      boolean uno = false;
      int cuenta = 0;
      if (decimal == 1) {

      }
      do {
        binario = Ejercicios1a14.pegaPorDetras(binario, decimal % 2);
        if ((decimal % 2 == 0) && (!uno)) {
          cuenta++;
        } else {
          uno = true;
        }
        decimal /= 2;

      } while (decimal > 1);

      binario = Ejercicios1a14.pegaPorDetras(binario, 1);
      binario = Ejercicios1a14.voltea(binario);
      for (int i = 0; i < cuenta; i++) {
        binario = Ejercicios1a14.pegaPorDetras(binario, 0);
      }
      System.out.println(binario);
    } else {
      System.out.println("1");

    }
  }
}
