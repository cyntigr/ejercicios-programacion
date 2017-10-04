/**
 * Escribe un programa que calcule el total de una factura a
 * partir de la base imponible (precio sin IVA). La base imponible
 * estará almacenada en una variable.
 *
 * @author Cyntia García Ruiz
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    double baseImponible = 26.35;
    double iva = 5.53;
    
    double total = baseImponible + iva;
    System.out.println("Base imponible  " + baseImponible); 
    System.out.println("IVA             " + iva);
    System.out.println("Total           " + total);   
   
  
  }
}
