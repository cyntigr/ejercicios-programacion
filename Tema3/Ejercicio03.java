/**
* Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*
* @author Cyntia Garcia Ruiz
*/

public class Ejercicio03 {
  public static void main(String[] args) {

    String linea;
    
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    double pesetas;
    pesetas = Double.parseDouble(linea);

    double euros = 166.386;
    double total;
    total = pesetas / euros;
 
    
    System.out.println("Aqui se muestra la conversión " + total);
  } 
}
