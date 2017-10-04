/**
 * Mostrar horario de clase con colores
 *
 * @author Cyntia Garcia Ruiz
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println("  Hora        Lunes         Martes          Miercoles     Jueves      Viernes");
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.printf("  %-10s  %-14s  %-14s  %-14s  %-14s  %-14s\n","08:15",rojo + "Programación",verde + "Sistemas",rojo + "     Programación",azul + "Entornos",verde + " Sistemas" + blanco);
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.printf("  %-10s  %-14s  %-14s  %-14s  %-14s  %-14s\n","09:15",rojo + "Programación",verde + "Sistemas",rojo + "     Programación",azul + "Entornos",verde + " Sistemas" + blanco);
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.printf("  %-10s  %-14s  %-14s  %-14s  %-14s  %-14s\n","10:15",rojo + "Programación",verde + "Sistemas",rojo + "     Programación",azul + "Entornos",verde + " Sistemas" + blanco);
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.printf("  %-10s  %-14s  %-14s  %-14s  %-14s  %-14s\n",blanco + "11:15","RECREO","RECREO","RECREO","RECREO","RECREO");
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.printf("  %-10s  %-14s  %-14s  %-14s  %-14s  %-14s\n","11:45",naranja + "BBDD",morado + "   Lenguaje",naranja + "      BBDD",morado + "        Lenguaje",blanco + "  Formación");
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.printf("  %-10s  %-14s  %-14s  %-14s  %-14s  %-14s\n","12:45",naranja + "BBDD",rojo + "   Programación",naranja + "  BBDD",morado + "     Lenguaje",blanco + "  Formación");
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.printf("  %-10s  %-14s  %-14s  %-14s  %-14s  %-14s\n","13:45",naranja + "BBDD",rojo + "   Programación",naranja + "  BBDD",morado + "     Lenguaje",blanco + "  Formación");
    System.out.println("-----------------------------------------------------------------------------------------");

  }
}
