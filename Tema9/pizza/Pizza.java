package pizza;

/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
 * cuatro quesos o funghi - y su estado - pedida o servida. La clase debe
 * almacenar información sobre el número total de pizzas que se han pedido y que
 * se han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 *
 *
 *
 * @author cyntia
 */
public class Pizza {

  //atributos
  private String tamano;
  private String tipo;
  private String estado = "pedida";
  private static int totalPizzasPedidas = 0;
  private static int totalPizzasServidas = 0;

  //metodos
  public Pizza(String tamano, String tipo) {
    this.tamano = tamano;
    this.tipo = tipo;
    Pizza.totalPizzasPedidas++;

  }

  public String getTamono() {
    return tamano;
  }

  public String getTipo() {
    return tipo;
  }

  public String getEstado() {
    return estado;
  }

  public static int getTotalPizzasPedidas() {
    return totalPizzasPedidas;
  }

  public static int getTotalPizzasServidas() {
    return totalPizzasServidas;
  }

  public void setTamono(String tamano) {
    this.tamano = tamano;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public static void setTotalPizzasPedidas(int totalPizzasPedidas) {
    Pizza.totalPizzasPedidas = totalPizzasPedidas;
  }

  public static void setTotalPizzasServidas(int totalPizzasServidas) {
    Pizza.totalPizzasServidas = totalPizzasServidas;
  }

  @Override
  public String toString() {
    return "Pizza " + tamano + " " + tipo + "," + estado;
  }
  
  public void sirve(){
    if(this.estado.equals("pedida")){
      System.out.println("Aquí tiene su pizza muchas gracias.");
      this.estado = "servida";
      Pizza.totalPizzasServidas++;
    } else {
      System.out.println("Lo siento esa pizza ya está servida.");
    }
    
  }
}
