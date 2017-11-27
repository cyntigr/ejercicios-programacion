/*
 * 
 *
 *Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 *elementos según la tabla que se muestra a continuación. Muestra el contenido
 *de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 *que no han sido inicializados?
 *
 *
 */
package tema7;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio2 {

  public static void main(String[] args) {
    char[] simbolo;
    simbolo = new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[8] = 'Q';
    simbolo[7] = '+';
    for (int i = 0; i <= 9; i++) {
      System.out.print(simbolo[i] + " ");
    }
  }
}
