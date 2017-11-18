/*
 * 
 *Realiza un programa que vaya generando números aleatorios pares entre 0
 *y 100 y que no termine de generar números hasta que no saque el 24. El
 *programa deberá decir al final cuántos números se han generado.
 *
 *
 */
package tema6;

/**
 *
 * @author Cintia Garcia Ruiz
 */
public class Ejercicio09 {

  public static void main(String[] args) {
System.out.println("Ahora vamos a ver números pares entre 0 y 100 hasta que salga 24.");
    int numero;
    int cuenta = 0;
    do {
      numero = (int) (Math.random() * 100);
      if (numero % 2 == 0) {
        System.out.print(numero + " ");
        cuenta++;
      }
    } while (numero != 24);
    System.out.println("");
    System.out.print("Se han generado " + cuenta + " números pares.");
  }
}
