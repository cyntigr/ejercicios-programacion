/**
*Escribe un programa que calcule el salario semanal de un empleado en base
*a las horas trabajadas, a razón de 12 euros la hora.
*
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio08 {
  public static void main(String[] args) {
    
    
    System.out.println("Cálculo de salario ");
    System.out.print("Dias trabajados: ");
    
    int diasTrabajados = Integer.parseInt(System.console().readLine());
    
    System.out.print("Horas diarias: ");
    
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    int totalHoras;
    totalHoras = diasTrabajados * horasTrabajadas;
    System.out.println("Horas total trabajadas " + totalHoras + "h");
    
    System.out.print("Importe horas: ");
    
    int importeHoras = Integer.parseInt(System.console().readLine());
    
    int salario = totalHoras * importeHoras;
    System.out.print("Salario semanal: " + salario);
    
  }
}
