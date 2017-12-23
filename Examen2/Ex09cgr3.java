/**
*
* Examen 02 programación,04-12-2017.
* Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre
* 0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente
* criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se
* cambia por el siguiente múltiplo de 5 que exista a partir de él. Utiliza dos arrays, uno para contener los
* números originales y otro para guardar el resultado.
*
* @author Cintia Garcia Ruiz
* 1ºDAM
* 
*/
 
public class Ex09cgr3{
  public static void main(String[] args) {
    int[] num = new int[15];
    int numero =0;
    int[] auxiliar = new int[15];
    
    for(int i = 0; i < 15; i++){
      numero = (int)(Math.random() * 500);
      num[i]=numero;
      
      if(numero % 5 == 0){
        auxiliar[i] = numero;
      } else{
          do{
            numero++;
          } while(numero % 5 != 0);
          auxiliar[i] = numero;
        }
    }
    System.out.println("Array original:");
    for(int i = 0; i < 15; i++){
      System.out.print(num[i] + " ");
    }
    System.out.println(" ");
    System.out.println("Array cincuerizado:");
    for(int i = 0; i < 15; i++){
      System.out.print(auxiliar[i] + " ");
    }
  }
}
