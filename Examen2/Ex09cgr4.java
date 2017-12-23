/**
*
* Examen 02 programación,04-12-2017.
* El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han
* traído un caballito de mar ($) y una caracola (@) para que le hagan compañía al pez. Realiza un
* programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en
* posiciones aleatorias. Por una cuestión de física elemental, ninguno de los animales puede
* coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera, que como
* mínimo serán de 4 unidades.
*
* @author Cintia Garcia Ruiz
* 1ºDAM
* 
*/

import java.util.Scanner;
 
public class Ex09cgr4{
  public static void main(String[] args) {
    System.out.println("Pinta una pecera con un pececito dentro, un caballito y una caracola.");
    System.out.println("---------------------------------------------------------------------");
    Scanner x = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alto = x.nextInt();
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int ancho = x.nextInt();
    int espacio = 0;
    int caballito = 0;
    int caracola = 0;
    int pececito = 0;
    do{
      pececito = ((int) (Math.random() * ((ancho-2)*(alto-2))));
      caballito = ((int) (Math.random() * ((ancho-2)*(alto-2))));
      caracola = ((int) (Math.random() * ((ancho-2)*(alto-2))));
    } while((caracola == caballito) || (pececito == caracola) || (caballito == pececito));
    // Parte superior de la pecera
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println(" ");
    // Parte central
    for (int i = 0; i < (alto - 2); i++) {
      System.out.print("*");

      for (int j = 0; j < (ancho - 2); j++) {
        if(espacio == caballito){
          System.out.print("$");
        }
        if(espacio == caracola){
          System.out.print("@");
        }
        if(espacio == pececito){
          System.out.print("&");
        }
        if((espacio != caballito) && (espacio != caracola) && (espacio != pececito)) {
        System.out.print(" ");
        }
        espacio++;
      }
      System.out.print("*");
      System.out.println(" ");
    }
    // Parte inferior de la pecera
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
  }
}
