package animales;

import animales.Animal;

/**
 *
 * @author cyntia
 */
public class Mamifero extends Animal {

  //atributos
  private int tiempoGestacion;
  private int numeroMamas;
          
  //constructor
  public Mamifero() {
    
  }

  //Métodos
  public int getTiempoGestacion() {
    return this.tiempoGestacion;
  }
  
  public int getNumeroMamas() {
    return this.numeroMamas;
  }

  public void setTiempoGestacion(int tiempoGestacion) {
    this.tiempoGestacion = tiempoGestacion;
  }

  public void setNumeroMamas(int numeroMamas) {
    this.numeroMamas = numeroMamas;
  }
  
}
