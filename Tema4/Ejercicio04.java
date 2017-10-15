/**
*Escribe un programa que calcule el salario semanal de un empleado en base
*a las horas trabajadas, a razón de 12 euros la hora y que cuando tenga 
* 41horas las ponga a 16€ la hora.
*
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio04 {
  public static void main(String[] args) {
    
    
    System.out.println("Cálculo de salario ");
    System.out.print("Dias trabajados: ");
    
    int diasTrabajados = Integer.parseInt(System.console().readLine());
    
    System.out.print("Horas diarias: ");
    
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    int totalHoras;
    totalHoras = diasTrabajados * horasTrabajadas;
    System.out.println("Horas total trabajadas " + totalHoras + "h");
    
    int importeHoras = 12;
    int importeHorasExtra = 16;
   
    
    if (totalHoras <= 40){
    int salario = totalHoras * importeHoras;
    System.out.print("Salario semanal: " + salario + " €");
    }
    
    else {
    int salarioExtra = (totalHoras - 40) * importeHorasExtra + 40 * importeHoras;
    System.out.print("Salario con horas extra incluidas: " + salarioExtra + " €");
    
    }
  }
}
