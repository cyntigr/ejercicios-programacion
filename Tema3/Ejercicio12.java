
/**
 *Realiza un programa que calcule la nota que hace falta sacar en el segundo
 *examen de la asignatura Programación para obtener la media deseada. Hay
 *que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 *segundo examen un 60%.
 *
 *
 * @author Cyntia García Ruiz
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.println("Cálculo nota para el segundo examen.");
    System.out.println("--------------------------");
    
    System.out.print("Introduce la nota del primer examen: ");
    double primerExam = Double.parseDouble(System.console().readLine());
    System.out.println("--------------------------");
    
    System.out.print("Introduce la nota media que quieres: ");
    double notaMedia = Double.parseDouble(System.console().readLine());
    System.out.println("--------------------------");
    
    double segundoExamen = (notaMedia - 0.4 * primerExam)/0.6;
    
    System.out.println("Necesitas sacar un " + segundoExamen);   
  }
}
