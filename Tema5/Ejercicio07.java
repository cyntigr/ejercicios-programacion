/**
 *Realiza el control de acceso a una caja fuerte. La combinación será un
 *número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 *acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 *y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 *Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Cyntia Garcia Ruiz
 */
 
 import java.util.Scanner;
 
public class Ejercicio07{
  public static void main(String[] args) {
  
    System.out.println("Introduce la clave de la caja fuerte tienes 4 intentos. ");
    System.out.println("--------------------------------------------------------");
    Scanner x = new Scanner(System.in);
    
    int intentos = 0;
    int clave;
    
    do {
      System.out.println("Introduce la clave: ");
      clave = x.nextInt();
      intentos++;
      if (clave == 8545) {
      System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } else {
          System.out.println("Lo siento, esa no es la combinación");
        }
    } while ((clave != 8545) && (intentos < 4));
  }
}
