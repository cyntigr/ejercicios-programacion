package vehiculos;

/**
 *
 * @author cyntia
 */
public class Coche extends Vehiculo {

 private String tipoAsientos;
 private int marchas;
 
  public Coche(String tipoAsientos, String color, String tipo, int ruedas, int marchas) {
    super(color, tipo, ruedas);
    this.tipoAsientos = tipoAsientos;
    this.marchas = marchas;
  }

  public String getTipoAsientos() {
    return tipoAsientos;
  }

  public int getMarchas() {
    return marchas;
  }

  public void setTipoAsientos(String tipoAsientos) {
    this.tipoAsientos = tipoAsientos;
  }

  public void setMarchas(int marchas) {
    this.marchas = marchas;
  }

  @Override
  public String toString() {
    return "Coche{" + "tipoAsientos=" + tipoAsientos + ", marchas=" + marchas + '}';
  }
  
  public void quemaRueda(){
    System.out.println("rum rum sale humo de las ruedas");
  }
}
