package tema9;

/**
 *
 * @author cyntia
 */

public class Ave extends Animal{
  
  //atributos
  private String vuela;
  private String especie;
  
//  //constructor
//  public Ave() {
//    
//  }
//  

  public Ave(String vuela, String especie, String n, String c, int e, String s) {
    super(n, c, e, s);
    this.vuela = vuela;
    this.especie = especie;
  }
  
  
  //Métodos
  
  public String getVuela() {
    return this.vuela;
  }
  
  public void come(String comida) {
    super.come(comida);
    System.out.println("Pio Pio que rico");
  }
  
}
