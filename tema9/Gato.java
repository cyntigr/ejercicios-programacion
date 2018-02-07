package tema9;

/**
 *
 * @author cyntia
 */

public class Gato extends Mamifero {

  //atributos
  String raza;
  
  //Métodos
  
   public Gato() {
  }

  public Gato(String raza) {
    this.raza = raza;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
  
  public void maulla(){
    System.out.println("Miau miau miau");
  }
  
  public void peleaCon(Gato contrincante){
    System.out.print(this.getNombre() );
    System.out.print(" ataca ha ");
    System.out.println(contrincante.getNombre());
  }
  
  public void seApareaCon(Gato otro){
    if(this.getSexo() != otro.getSexo()){
      Gato syndi = new Gato("romano");
      syndi.setNombre("Syndi");
      System.out.print("Han tenido una gatita llamada ");
      System.out.println(syndi.getNombre());
    }
  }
    
  @Override
  public String toString() {
    return "Gato{" + "raza=" + raza + super.toString() + '}';
  }
  
  
}
