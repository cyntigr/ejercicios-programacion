/**
*
*Examen 01 programación,08-11-2017.
*Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
*positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
*primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
*cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
*
*
* @author Cintia Garcia Ruiz
* 1ºDAM
* 
*/

import java.util.Scanner;
 
public class Ex09cgr1{
  public static void main(String[] args) {
  
  System.out.println("Cálculo de la media, el numero maximo, el minimo y la cuenta.");
  System.out.println("-------------------------------------------------------------");
    
    int num = 0;
    int division = 0;
    int suma = 0;
    int divi = 0;
    int contar = -1;
    int maximo = 0;
    int minimo = 99999;
    
    System.out.print("Por favor, vaya introduciendo números enteros positivos.");
    System.out.println("Para terminar, introduzca un número primo:");
    do {
      
      Scanner x = new Scanner(System.in);
      num = x.nextInt();
      
      divi = 0;
      //Comprobar si es primo
      for (int j = 2; j < num; j++){
        if ((num % j) == 0) {
          divi = 1;
        }
      }
      //Media de los números
      if (num >= 0 && (divi != 0)){
      suma = num + suma;
      division++;}
      
      //Número mayor
      if((num > maximo) && (divi != 0)){
            maximo = num;
      }
      //Número menor
      
      if((num > minimo) && (divi != 0)){
        minimo = num;
      }
      if(num < minimo){
          minimo = num;
        }
      contar++;
    } while (divi != 0);
    //lo que muestra
    System.out.println("Ha introducido: " + contar + " números no primos.");
    System.out.println("El número maximo es: " + maximo);
    System.out.println("El número minimo es: " + minimo);
    System.out.printf("La media es: %.2f",(double)suma/division);


  }
}
