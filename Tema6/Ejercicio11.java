/*
 * 
 *Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 *aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 *final aparecerá el número de suspensos, el número de suficientes, el número
 *de bienes, etc.
 *
 */
package tema6;

/**
 *
 * @author cyntia
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    int notas;
    String caracter = null;

    for (int j = 1; j <= 20; j++) {
      notas = (int) (Math.random() * 5) + 1;

      switch (notas) {
        case 1:
          caracter = "suspenso";
          break;
        case 2:
          caracter = "suficiente";
          break;
        case 3:
          caracter = "bien";
          break;
        case 4:
          caracter = "notable";
          break;
        case 5:
          caracter = "sobresaliente";
          break;
      }

      System.out.println(caracter + " ");
      if (caracter.equals("suspenso")) {
        suspenso++;
      }
      if (caracter.equals("suficiente")) {
        suficiente++;
      }
      if (caracter.equals("bien")) {
        bien++;
      }
      if (caracter.equals("notable")) {
        notable++;
      }
      if (caracter.equals("sobresaliente")) {
        sobresaliente++;
      }
    }
    System.out.println("Hay " + suspenso + " suspensos.");
    System.out.println("Hay " + suficiente + " suficiente.");
    System.out.println("Hay " + bien + " bien.");
    System.out.println("Hay " + notable + " notable.");
    System.out.println("Hay " + sobresaliente + " sobresaliente.");
  }

}
