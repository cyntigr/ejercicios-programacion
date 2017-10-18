/**
*Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
*nos está siendo infiel. El programa irá haciendo preguntas que el usuario
*contestará con verdadero o falso. Cada pregunta contestada como verdadero
*sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
*za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
*del programa.
*
*
*
* 
*
*@utor Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
  
    Scanner x = new Scanner(System.in);
    System.out.println("Par o divisible entre 5: ");
    System.out.println("-------------------------");
    
    System.out.println("Introduce el numero: ");
    int num1 = Integer.parseInt(x.nextLine());
