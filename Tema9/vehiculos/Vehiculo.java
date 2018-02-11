package vehiculos;

/**
 *
 * @author cyntia
 */
public abstract class Vehiculo {

  private String color;
  private String tipo;
  private int ruedas = 0;
  private static int kilometrosTotales = 0;
  private int kilometrosRecorridos = 0;
  
  public Vehiculo(String color, String tipo, int ruedas) {
    this.color = color;
    this.tipo = tipo;
    this.ruedas = ruedas;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  

  public String getColor() {
    return color;
  }

  public String getTipo() {
    return tipo;
  }

  public int getRuedas() {
    return ruedas;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setRuedas(int ruedas) {
    this.ruedas = ruedas;
  }
   
  @Override
  public String toString() {
    return "Vehiculo{" + "color=" + color + ", tipo=" + tipo + ", ruedas=" + ruedas + '}';
  }
  
  public void anda(int km){
    Vehiculo.kilometrosTotales += km;
    this.kilometrosRecorridos += km;
  }
  
}
