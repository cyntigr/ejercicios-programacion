/**
*
*Examen 01 programación,08-11-2017.
*
*La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
*ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una
*bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el
*precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El
*IVA ya está incluido en todas las tarifas.
*
* @author Cintia Garcia Ruiz
* 1ºDAM
* 
*/

import java.util.Scanner;
 
public class Ex09cgr2{
  public static void main(String[] args) {
  
  
    System.out.println("Calculo del precio de una bandera.");
    System.out.println("---------------------------------");
    
    
    
    
    System.out.println("Introduzca la altura de la bandera en cm2: ");
    Scanner x = new Scanner(System.in);
    double altura = x.nextInt();
    System.out.println("Ahora introduzca la anchura:");
    double ancho = x.nextInt();
    System.out.println("¿Quiere escudo bordado? Seleccione el número 1) Si y 2) No: ");
    double escudo = x.nextInt();
    
    double metros = altura * ancho;
    double total = 0;
    double costeMetros = metros * 0.01;
    
    switch((int)escudo){
      case 1:
      escudo = 2.5;
      total = costeMetros + escudo + 3.25;
      break;
      case 2:
      escudo = 0;
      total = costeMetros + 3.25;
      break;
    } 
    
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.println("Bandera de " + (int)metros + "cm2: " + costeMetros + "€");
    if(escudo == 0){
    System.out.println("Sin escudo: " + escudo + "€");
    } else {
        System.out.println("Con escudo: " + escudo + "€");
      }
    System.out.println("Gastos de envío: 3.25 €");
    System.out.println("Total: " + total + "€");
  }
}
