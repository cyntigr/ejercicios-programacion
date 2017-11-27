/*
 * 
 *
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 * 
 *
 */
package tema6;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
    int figura;
    String nombreFigura = null;
    int figuraUno = 0;
    int figuraDos = 0;
    int figuraTres = 0;
    System.out.println("Máquina tragaperras esto es una simulación de una tirada.");
    System.out.println("---------------------------------------------------------");
    System.out.print(" | ");
    for (int i = 1; i <= 3; i++) {
      figura = ((int) (Math.random() * 5) + 1);
      switch (figura) {
        case 1:
          nombreFigura = "cereza";
          break;
        case 2:
          nombreFigura = "limon";
          break;
        case 3:
          nombreFigura = "campana";
          break;
        case 4:
          nombreFigura = "herradura";
          break;
        case 5:
          nombreFigura = "diamante";
          break;
      }
      System.out.print(nombreFigura + " | ");
      switch (i) {
        case 1:
          figuraUno = figura;
          break;
        case 2:
          figuraDos = figura;
          break;
        case 3:
          figuraTres = figura;
          break;
      }
    }
    if ((figuraDos == figuraUno) && (figuraDos == figuraTres)) {
      System.out.println("");
      System.out.print(" Enhorabuena, ha ganado 10 monedas.");
    }
    if ((figuraDos == figuraUno) || (figuraDos == figuraTres) || (figuraUno == figuraTres)) {
      System.out.println("");
      System.out.print(" Bien,ha recuperado su moneda.");
    }
    if ((figuraDos != figuraUno) && (figuraDos != figuraTres) && (figuraUno != figuraTres)) {
      System.out.println("");
      System.out.print(" Lo siento, ha perdido.");
    }

  }

}
