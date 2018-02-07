package tema9;

/**
 *
 * @author cyntia
 */

public class Ave extends Animal{
  
  //atributos
  private String vuela;
  private String especie;
  
  //constructor
  public Ave() {
  }
 

  public Ave(String vuela, String especie, String n, String c, int e, String s) {
    super(n, c, e, s);
    this.vuela = vuela;
    this.especie = especie;
  }
  
  
  //Métodos
  
  public String getVuela() {
    return this.vuela;
  }

  public void setVuela(String vuela) {
    this.vuela = vuela;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }
  
  public void come(String comida) {
    super.come(comida);
    System.out.println("Pio Pio que rico");
  }
  
   public void estaVolando(){
    System.out.println("sss sss sss sss sss sss");
  }
  
  public void pia(){
    System.out.println("pio pio pio");
  }

  @Override
  public String toString() {
    return "Ave{" + "vuela=" + vuela + ", especie=" + especie + '}';
  }
  
}
