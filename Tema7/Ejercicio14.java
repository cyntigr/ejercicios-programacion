/*
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;

public class Ejercicio14 {

  public static void main(String[] args) {

    String[] colores = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
    };
    String[] palabras = new String[8];
    String[] palabrasOrdenadas = new String[8];
    String[] palabrasSiguientes = new String[8];
    int cuentaColor = 0;
    int cuenta = 0;
    Scanner x = new Scanner(System.in);
    System.out.println("Introduce 8 palabras y te ordenare los colores al principio: ");
    for (int i = 0; i < 8; i++) {
      palabras[i] = x.nextLine();

      for (String c : colores) {
        if (palabras[i].equals(c)) {
          palabrasOrdenadas[cuentaColor++] = palabras[i];
        } else{ 
            palabrasSiguientes[cuenta++] = palabras[i];
        }
      }
    }
    for (int i = 0; i < cuentaColor; i++) {
      palabras[i] = palabrasOrdenadas[i];
    }

    for (int i = cuentaColor; i < 8; i++) {
      palabras[i] = palabrasSiguientes[i-cuentaColor];
    }
    for (int i = 0; i < 8; i++) {
      System.out.print(palabras[i] + " ");
    }

  }
}
