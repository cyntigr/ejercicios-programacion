/*
 * 
 *Realiza un generador de melodía con las siguientes condiciones:
 *a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 *sol, la y si.
 *b) Una melodía está formada por un número aleatorio de notas mayor o igual
 *a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
 *c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 *compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 *con dos barras.
 *d) La última nota de la melodía debe coincidir con la primera.
 *
 *
 *
 */
package tema6;

/**
 *
 * @author Cintia Garcia Ruiz
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    int notasMusicales;
    int primeraNota;
    String notaFinal = null;
    int melodia;
    String nota = null;
    primeraNota = ((int) (Math.random() * 7) + 1);
    switch (primeraNota) {
      case 1:
        notaFinal = "do ";
        break;
      case 2:
        notaFinal = "re ";
        break;
      case 3:
        notaFinal = "mi ";
        break;
      case 4:
        notaFinal = "fa ";
        break;
      case 5:
        notaFinal = "sol ";
        break;
      case 6:
        notaFinal = "la ";
        break;
      case 7:
        notaFinal = "si ";
        break;
    }
    System.out.print(notaFinal);
    for (int i = 1; i <= 2; i++) {
      notasMusicales = ((int) (Math.random() * 7) + 1);
      switch (notasMusicales) {
        case 1:
          nota ="do ";
          break;
        case 2:
          nota ="re ";
          break;
        case 3:
          nota ="mi ";
          break;
        case 4:
          nota ="fa ";
          break;
        case 5:
          nota ="sol ";
          break;
        case 6:
          nota ="la ";
          break;
        case 7:
          nota ="si ";
          break;
      }
      System.out.print(nota);
    }
    melodia = ((int) (Math.random() * 5) + 1);
    if(melodia == 1){
      System.out.print(notaFinal);
    } else{
      notasMusicales = ((int) (Math.random() * 7) + 1);
      switch (notasMusicales) {
        case 1:
          nota ="do ";
          break;
        case 2:
          nota ="re ";
          break;
        case 3:
          nota ="mi ";
          break;
        case 4:
          nota ="fa ";
          break;
        case 5:
          nota ="sol ";
          break;
        case 6:
          nota ="la ";
          break;
        case 7:
          nota ="si ";
          break;
      }
    System.out.print(nota);
    }
    System.out.print("|");
   
    if (melodia > 2) {
      for (int k = 1; k <= melodia; k++) {
        for (int i = 1; i <= 4; i++) {
          notasMusicales = ((int) (Math.random() * 7) + 1);
          switch (notasMusicales) {
            case 1:
              System.out.print("do ");
              break;
            case 2:
              System.out.print("re ");
              break;
            case 3:
              System.out.print("mi ");
              break;
            case 4:
              System.out.print("fa ");
              break;
            case 5:
              System.out.print("sol ");
              break;
            case 6:
              System.out.print("la ");
              break;
            case 7:
              System.out.print("si ");
              break;
          }
        }
        System.out.print("|");
      }
    }
    if(melodia>=2){
    for (int i = 1; i <= 3; i++) {
      notasMusicales = ((int) (Math.random() * 7) + 1);
      switch (notasMusicales) {
        case 1:
          System.out.print("do ");
          break;
        case 2:
          System.out.print("re ");
          break;
        case 3:
          System.out.print("mi ");
          break;
        case 4:
          System.out.print("fa ");
          break;
        case 5:
          System.out.print("sol ");
          break;
        case 6:
          System.out.print("la ");
          break;
        case 7:
          System.out.print("si ");
          break;
      }
    }
    System.out.print(notaFinal);
    System.out.print("|");
    }
    System.out.print("|");

  }
}
