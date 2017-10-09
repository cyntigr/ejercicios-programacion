/**
*Escribe un programa que calcule el área de un rectángulo.
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio05 {
  public static void main(String[] args) {
  
    String numero;
    
    System.out.println("Cálculo del área de un rectángulo: ");
    System.out.print("Introduce la base: ");
    
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la altura: ");
    
    double altura = Double.parseDouble(System.console().readLine());
    
    double total;
    total = base * altura;

    System.out.print("El área del rectángulo es: " + total + "cm2");
  }
}
