/**
*Amplía el programa anterior para que diga la nota del boletín (insuficiente,
*suficiente, bien, notable o sobresaliente).
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio08 {
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
    
    System.out.println("----------------");
    System.out.printf("Media: %.2f\n", m);

    
    if (m < 5) {
      System.out.println("Insuficiente");
    }
    
    if ((m >= 5) && (m < 6)) {
      System.out.println("Suficiente");
    }
    
    if ((m >= 6) && (m < 7)) {
      System.out.println("Bien");
    }
    
    if ((m >= 7) && (m < 9)) {
      System.out.println("Notable");
    } 
    
    if (m >= 9) {
      System.out.println("Sobresaliente");
    }
  }
}
