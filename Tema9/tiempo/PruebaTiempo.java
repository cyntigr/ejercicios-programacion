package tiempo;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class PruebaTiempo {
    public static void main(String[] args) {
      Tiempo p1 = new Tiempo(0, 30, 40);
      Tiempo p2 = new Tiempo(0, 35, 20);
      
      p2.restar(p1);
      System.out.println(p2);
    }

}
