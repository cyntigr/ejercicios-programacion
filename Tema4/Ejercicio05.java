/**
*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("Cálculo ecuación de primer grado:");
    System.out.println("---------------------------------");
    System.out.print("variable a: ");
    
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Variable b: ");
    
    int b = Integer.parseInt(System.console().readLine());
    
    double x = (double)-b/a;
    System.out.printf("Solución: %.2f", x);
  }
}
