package animales;

/**
 *
 * @author cyntia
 */
public class Perro extends Mamifero {

  //atributos 
  private String hocico;
  private String pelo;

  //constructor
  public Perro(String hocico, String pelo) {
    this.hocico = hocico;
    this.pelo = pelo;
  }

  //metodos
  public String getHocico() {
    return hocico;
  }

  public String getPelo() {
    return pelo;
  }

  public void setHocico(String hocico) {
    this.hocico = hocico;
  }

  public void setPelo(String pelo) {
    this.pelo = pelo;
  }

  public void hueleA(Perro amiga) {
    System.out.println("ff ff ff que bien hueles");
  }

  public void ataca(Perro enemigo) {
    if (this.getSexo() != enemigo.getSexo()) {
      System.out.println("ff ff ff que bien hueles");
    } else{
      System.out.print("Le muerdo la cola");
    }
  }

  @Override
  public String toString() {
    return "Perro{" + "hocico=" + hocico + ", pelo=" + pelo + '}';
  }

}
