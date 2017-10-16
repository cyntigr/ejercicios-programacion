/**
*Realiza un programa que calcule el tiempo que tardará en caer un
*objeto desde una altura h. Aplica la fórmula t = √2h/g siendo g = 9.81m/s2
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio06 {
  public static void main(String[] args) {
    
    System.out.println("Cálculo tiempo de caida de un objeto:");
    System.out.println("-------------------------------------");
    System.out.print("Altura : ");
    
    int h = Integer.parseInt(System.console().readLine());
    double g = 9.81;
    
    double t = (double)Math.sqrt(2*h/g);
    System.out.printf("Solución: %.2fs", t);
  }
}
