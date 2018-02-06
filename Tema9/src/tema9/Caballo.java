package tema9;

/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando 
 * instancias y aplicándole algunos métodos.
 * 
 * 
 * @author cyntia
 */
public class Caballo {
  //Atributos
  private String nombre, color, uso, raza, sexo;
  private int edad;

  //Construcctor 
  Caballo() {
  }
  
  Caballo(String n,String c,String u, String r, String s, int e) {
    this.nombre = n;
    this.color = c;
    this.edad = e;
    this.raza = r;
    this.sexo = s;
    this.uso = u;
  }
  
  //Métodos
  public String getNombre() {
    return this.nombre;
  }
  
  public void corre(){
    System.out.println("tocotoc tocotoc tocotoc tocotoc");
  }
  
  public void come(){
    System.out.println("umm ñam ñam");
  }  
  
  public void salta(){
    System.out.println("salti salti");
  }
  
  public void anda(){
    System.out.println("clac clac");
  }
}
