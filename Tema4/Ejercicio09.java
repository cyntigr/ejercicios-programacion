/**
*Realiza un programa que resuelva una ecuación de segundo grado (del tipo
*ax2 + bx + c = 0).
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio09 {
  public static void main(String[] args) {
    
    System.out.println("Cálculo ecuación de segundo grado:");
    System.out.println("---------------------------------");
    
    System.out.print("variable a: ");
    
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Variable b: ");
    
    int b = Integer.parseInt(System.console().readLine());
    
    System.out.print("Variable c: ");
    
    int c = Integer.parseInt(System.console().readLine());
    
    double x3 =(double) b*b - 4*a*c;
    
    if (x3 >= 0){
      double x1 = (double)((-b + Math.sqrt(x3)) / (2*a));
      double x2 = (double)((-b - Math.sqrt(x3)) / (2*a));
    
      System.out.printf("Solución 1: %.2f\n", x1);
      System.out.printf("Solución 2: %.2f\n", x2);
    }
    
    if (x3 < 0){
      System.out.printf("No tiene solución");
    }
    
  }
}
