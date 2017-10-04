/**
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asignale los valores 144 y 999 respectivamente. A continuación,
 * muestra por pantalla el valor de cada variable, la suma, la resta,
 * la división y la multiplicación.
 *
 * @author Cyntia García Ruiz
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;
    double division;

    System.out.println("Mis variables son " + x +" " + y);

    int suma = x + y;
    System.out.println("La suma de mis variables es " + suma);
    
    int resta = y - x;
    System.out.println("La resta de mis variables es " + resta);
    
    division = (double)y / (double)x;
    System.out.println("La division de mis variables es " + division);
    
    int mult = x * y;
    System.out.println("La multiplicación de mis variables es " + mult);   
  }
}
