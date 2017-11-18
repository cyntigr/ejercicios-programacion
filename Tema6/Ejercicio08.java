/*
 *
 *Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 *de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 *2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 *
 *
 */
package tema6;

/**
 *
 * @author Cintia Garcia Ruiz
 */
public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.println("Resultado de 3 columnas de la quiniela");
    System.out.println("--------------------------------------");
    int cuenta = 0;
    int numero;
    System.out.println("Columna 1  Columna 2 Columna 3");
    do {
      for (int i = 1; i <= 3; i++) {
        // Probabilidad de que te salga la mita ...
        numero = (int) (Math.random() * 6)+1;
        switch (numero) {
          case 1:
          case 2:
          case 3:
            System.out.print("|1  |        ");
            break;
          case 4:
          case 5:
            System.out.print("| x |        ");
            break;
          case 6:
            System.out.print("|  2|        ");
            break;
        }
      }
      System.out.println(" ");
      cuenta++;
    } while (cuenta < 14);
    
        System.out.print("Pleno al 15: ");
        // probabilidad para que te de un caso solo.
        numero = (int) (Math.random() * 6)+1;
        switch (numero) {
          case 1:
          case 2:
          case 3:
            System.out.print("|1  |        ");
            break;
          case 4:
          case 5:
            System.out.print("| x |        ");
            break;
          case 6:
            System.out.print("|  2|        ");
            break;
        }
      

  }

}
