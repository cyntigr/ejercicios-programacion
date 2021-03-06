package matematicas;

/**
 *
 * @author cyntia
 */
public class Fraccion {
  //atributos

  private int numerador;
  private int denominador;
  //constructor

  public Fraccion(int numerador, int denominador) {
    this.denominador = denominador;
    this.numerador = numerador;
  }

  //metodos
  public int getDenominador() {
    return denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public void invierte() {
    int aux = this.denominador;
    this.denominador = this.numerador;
    this.numerador = aux;
  }

  public void simplifica() {
    int num = Math.abs(this.numerador);
    int den = Math.abs(this.denominador);
    int maximo;
    if (den == 0) {
      maximo = num;
    } else {
      int r;
      while (den != 0) {
        r = num % den;
        num = den;
        den = r;
      }
      maximo = num;
    }
    
    this.denominador /= maximo;
    this.numerador /= maximo;
  }

  public void multiplica(Fraccion n) {
    this.numerador = numerador * n.numerador;
    this.denominador = denominador * n.denominador;
  }

  public void divide(Fraccion n) {
    this.numerador = numerador * n.denominador;
    this.denominador = denominador * n.numerador;
  }

  @Override
  public String toString() {
    return "fraccion{" + "denominador=" + denominador + ", numerador=" + numerador + '}';
  }
}
