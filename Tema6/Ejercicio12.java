/*
 * 
 *
 *Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 *con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 *convertir un entero en un carácter.
 *
 *
 *
 *
 */
package tema6;

/**
 *
 * @author Cintia Garcia Ruiz
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    long matrix;
    String verde = "\033[32m";
    for(int i=1;i>0;i++){
      for(int j=1;j<100;j++){
        matrix = ((long) (Math.random() * 93) + 32);
        System.out.print(verde + (char)matrix);
      }
      System.out.println(" ");
    }
  }
  
}
