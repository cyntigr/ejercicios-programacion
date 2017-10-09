/**
*Escribe un programa que calcule el total de una factura a partir de 
*la base imponible.
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio07 {
  public static void main(String[] args) {
  
    String numero;
    
    System.out.println("Factura simplificada: ");
    System.out.print("Producto 1 importe: ");
    
    double importe1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Producto 2 importe: ");
    
    double importe2 = Double.parseDouble(System.console().readLine());
    
    double totalCompra;
    totalCompra = importe1 + importe2;
    double totalIva;
    totalIva = totalCompra * 0.21;
    double total;
     total = totalCompra + totalIva;

    System.out.print("El total del importe es: " + total + " €");
  }
}
