/**
 * Realiza un conversor de Kb a Mb.
 *
 *
 *
 * @author Cyntia García Ruiz
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    int kb = 1024;
    
    System.out.println("Conversion de Kb a Mb");
    System.out.println("--------------------------");
    
    System.out.print("Introduce los Kb: ");
    int mb = Integer.parseInt(System.console().readLine());
    System.out.println("--------------------------");
    int div = mb / kb;
    System.out.println("Son " + div + " Mb");   
  }
}
