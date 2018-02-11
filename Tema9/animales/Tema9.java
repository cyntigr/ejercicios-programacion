package animales;

import matematicas.Fraccion;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Tema9 {

  public static void main(String[] args) {

    Ave piolin = new Ave("Si", "Canario", "Piolín", "Amarillo", 2, "Macho");

    piolin.come("arpiste");

    Gato garfiel = new Gato("romano");
    garfiel.setNombre("Garfiel");
    garfiel.setSexo("macho");
    Gato silvestre = new Gato("main coon");
    silvestre.setNombre("Silvestre");
    garfiel.peleaCon(silvestre);
    Gato mini = new Gato("siames");
    mini.setSexo("hembra");

    garfiel.seApareaCon(mini);

    Fraccion f = new Fraccion(2, 5);
    f.invierte();
    System.out.println(f);

  }
}
