/**
*Escribe un programa que calcule el volumen de un cono según la fórmula
*V =1/3 πr2h
*
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio09 {
  public static void main(String[] args) {
  
    String numero;
    
    System.out.println("Cálculo volumen cono ");
    System.out.print("Introduce el radio del cono cm: ");
    
    double radioCono = Double.parseDouble(System.console().readLine());
    
    System.out.print("introduce ahora la altura cm: ");
    
    double alturaCono = Double.parseDouble(System.console().readLine());
    
    Double volumen;
    volumen = 3.14 * (radioCono * 2) * alturaCono / 3 ;
    System.out.print("El volumen del cono es: " + volumen + " cm2" );
    
  }
}
