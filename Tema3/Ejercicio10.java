/**
 * Realiza un conversor de Mb a Kb.
 *
 *
 *
 * @author Cyntia García Ruiz
 */

public class Ejercicio10 {
  public static void main(String[] args) {

    int mb = 1024;
    
    System.out.println("Conversion de Mb a Kb");
    System.out.println("--------------------------");
    
    System.out.print("Introduce los Mb: ");
    int kb = Integer.parseInt(System.console().readLine());
    System.out.println("--------------------------");
    int mult = mb * kb;
    System.out.println("Son " + mult + " Kb");   
  }
}
