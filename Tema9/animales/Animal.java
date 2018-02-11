package animales;

/**
 *
 * @author cyntia
 */
public class Animal {

  //atributos
  private String color, nombre, sexo;
  private int edad;

  //constructor
  public Animal() {
  }

  public Animal(String n, String c, int e, String s) {
    this.nombre = n;
    this.color = c;
    this.edad = e;
    this.sexo = s;
  }

  //Métodos
  public String getNombre() {
    return this.nombre;
  }

  public String getColor() {
    return this.color;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getSexo() {
    return this.sexo;
  }

  void setEdad(int e) {
    this.edad = e;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void come(String comida) {
    System.out.println("Estoy comiendo");
  }

  @Override
  public String toString() {
    return "Animal{" + "color=" + color + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + '}';
  }
  
}
