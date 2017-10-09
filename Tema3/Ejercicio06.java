/**
*Escribe un programa que calcule el área de un Triángulo.
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio06 {
  public static void main(String[] args) {
  
    String numero;
    
    System.out.println("Cálculo del área de un Triángulo: ");
    System.out.print("Introduce la base: ");
    
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la altura: ");
    
    double altura = Double.parseDouble(System.console().readLine());
    
    double total;
    total = base * altura / 2 ;

    System.out.print("El área del Triángulo es: " + total + " cm2");
  }
}
