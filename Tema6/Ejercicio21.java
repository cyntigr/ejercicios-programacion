/*
 * 
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 *
 */
package tema6;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio21 {

  public static void main(String[] args) {
    int moneda = 0;
    int caraCruz = 0;
    for(int i= 0;i <5;i++){
      moneda = ((int) (Math.random() * 8)+1);
      switch(moneda){
        case 1:
          System.out.print("1 céntimo");
          break;
        case 2:
          System.out.print("2 céntimos");
          break;
        case 3:
          System.out.print("5 céntimos");
          break;
        case 4:
          System.out.print("10 céntimos");
          break;
        case 5:
          System.out.print("20 céntimos");
          break;
        case 6:
          System.out.print("50 céntimos");
          break;
        case 7:
          System.out.print("1 euro");
          break;
        case 8:
          System.out.print("2 euros");
          break;
        default:
      }
      System.out.print(" - ");
      caraCruz = ((int) (Math.random() * 2)+1);
      
      switch(caraCruz){
        case 1:
          System.out.println("Cara");
          break;
        case 2:
          System.out.println("Cruz");
          break;
        default:
      }
      System.out.println("");
    }
  }

}
