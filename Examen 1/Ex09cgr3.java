/**
*
*Examen 01 programación,08-11-2017.
*Una empresa de cartelería nos ha encargado un programa para realizar uno de sus diseños. Debido a
*los últimos acontecimientos que han tenido lugar en Cataluña, han recibido muchos pedidos del cartel
*que muestra el número 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
*usuario se le pedirán dos datos, la altura del cartel y el número de espacios que habrá entre los
*números. La altura mínima es 5. La anchura de los números siempre es la misma. La parte superior
*de los cincos también es siempre igual. La parte inferior del 5 sí que varía en función de la altura.
*
*
* @author Cintia Garcia Ruiz
* 1ºDAM
* 
*/

import java.util.Scanner;
 
public class Ex09cgr3{
  public static void main(String[] args) {
    System.out.println("Diseño de un cartel con el número 155 con asteriscos.");
    System.out.println("-----------------------------------------------------");
    
    Scanner x = new Scanner(System.in);
    System.out.print("Introduce la altura del cartel: ");
    int altura = x.nextInt();
    System.out.print("Introduce los espacios: ");
    int espaciosLetras = x.nextInt();
    int espacioInterior = 0;
    
    if(altura >= 5){
      //PARTE DE ARRIBA
      System.out.print("*");
      for (int i = 1; i <= espaciosLetras; i++){
        System.out.print(" ");
      }
      for (int j = 1; j <= 4; j++){
        System.out.print("*");
      }
      for (int k = 1; k <= espaciosLetras; k++){
        System.out.print(" ");
      }
      for (int l = 1; l <= 4; l++){
        System.out.print("*");
      }
      System.out.println("");
      //segunda parte
      System.out.print("*");
      for (int i = 1; i <= espaciosLetras; i++){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int k = 1; k <= (espaciosLetras + 3); k++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
      
      //tercera parte
      System.out.print("*");
      for (int i = 1; i <= espaciosLetras; i++){
        System.out.print(" ");
      }
      for (int j = 1; j <= 4; j++){
        System.out.print("*");
      }
      for (int k = 1; k <= espaciosLetras; k++){
        System.out.print(" ");
      }
      for (int l = 1; l <= 4; l++){
        System.out.print("*");
      }
      System.out.println("");
      
      //parte que cambia
      for(int m = 1; m <= altura - 4; m++){
        System.out.print("*");
        for (int i = 1; i <= espaciosLetras + 3; i++){
          System.out.print(" ");
        }
          System.out.print("*");
        for (int k = 1; k <= espaciosLetras + 3; k++){
          System.out.print(" ");
        }
          System.out.print("*");
        System.out.println("");
      }
      
      //base
      System.out.print("*");
      for (int i = 1; i <= espaciosLetras; i++){
        System.out.print(" ");
      }
      for (int j = 1; j <= 4; j++){
        System.out.print("*");
      }
      for (int k = 1; k <= espaciosLetras; k++){
        System.out.print(" ");
      }
      for (int l = 1; l <= 4; l++){
        System.out.print("*");
      }
      System.out.println("");
      
      
    }
  }
}
