/**
*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio04 {
  public static void main(String[] args) {
    String numero;
    
    System.out.print("Introduce el número: ");
    numero = System.console().readLine();
    
    int primerNumero;
    primerNumero = Integer.parseInt(numero);
    
    System.out.print("Introduce otro número: ");
    numero = System.console().readLine();
    
    int segundoNumero;
    segundoNumero = Integer.parseInt(numero);
    
    int suma;
    suma = primerNumero + segundoNumero;
    int resta;
    resta = primerNumero - segundoNumero;
    int multi;
    multi = primerNumero * segundoNumero;
    int divi;
    divi = primerNumero / segundoNumero;
    System.out.println("Resultado suma de los números: " + suma);
    System.out.println("Resultado de la resta: " + resta);
    System.out.println("Resultado de la multiplicación: " + multi);
    System.out.print("Resultado de la división: " + divi);
  }
}
