/**
*Realiza un programa que calcule la media de tres notas.
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio07 {
  public static void main(String[] args) {
    
    System.out.println("Cálculo nota media:");
    System.out.println("-------------------");
    System.out.print("Nota 1: ");
    
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Nota 2: ");
    
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Nota 3: ");
    
    double c = Double.parseDouble(System.console().readLine());
    
    double m = (a+b+c)/3;
    
    System.out.printf("Media: %.2f", m);
  }
}
