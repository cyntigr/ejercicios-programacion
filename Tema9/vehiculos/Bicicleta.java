package vehiculos;

/**
 *
 * @author cyntia
 */
public class Bicicleta extends Vehiculo{

  String material;

  public Bicicleta(String material, String color, String tipo, int ruedas) {
    super(color, tipo, ruedas);
    this.material = material;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return "Bicicleta{" + "material=" + material + '}';
  }
  
  public void caballito(){
    System.out.println("   *");
    System.out.println(".-/");
    System.out.println(" *");
  }
  
}
