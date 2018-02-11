package tiempo;

/**
 *
 * @author cyntia
 */
public class Tiempo {
  private int horas;
  private int minutos;
  private int segundos;

  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public int getHoras() {
    return horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }

  @Override
  public String toString() {
    return horas + "h " + minutos + "m " + segundos + "s ";
  }
  
  public void sumar(Tiempo sumando){
    int segundosT1 = (this.horas * 3600) + (this.minutos * 60) + this.segundos;
    int segundosT2 = (sumando.horas * 3600) + (sumando.minutos * 60) + sumando.segundos;
    
    segundosT1 += segundosT2;
    this.horas = (segundosT1 / 3600);
    segundosT1 -= (this.horas * 3600);
    this.minutos = (segundosT1 / 60);
    segundosT1 -= (this.minutos * 60);
    this.segundos = segundosT1;
  }
  public void restar(Tiempo restando){
    int segundos = this.horas * 3600 + this.minutos * 60 + this.segundos;
    int segundosRestando = restando.horas * 3600 + restando.minutos * 60 + restando.segundos;
    
    segundos -= segundosRestando;
    this.horas = segundos / 3600;
    segundos -= this.horas * 3600;
    this.minutos = segundos / 60;
    segundos -= this.minutos * 60;
    this.segundos = segundos;
  }
}
