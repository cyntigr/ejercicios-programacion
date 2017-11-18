/*
 * Realiza un programa que pinte por pantalla diez líneas formadas por carac-
 * teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 */
package tema6;

/**
 *
 * @author Cintia Garcia Ruiz
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    int caracterAleatorio = (int) (Math.random() * 6)+1;
    String caracter = null;
        switch (caracterAleatorio) {
          case 1:
           caracter ="*";
           break;
          case 2:
            caracter ="-";
            break;
          case 3:
            caracter ="|";
            break;
          case 4:
            caracter ="=";
            break;
          case 5:
            caracter =".";
            break;
          case 6:
            caracter ="@";
            break;
        }
    int fila = (int) (Math.random() * 40)+1;
    for(int i= 1; i <=10;i++){
      for(int j=1;j <= fila;j++){
        System.out.print(caracter);
      }
      System.out.println(" ");
    }
  }
  
}
