/**
*Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
*nos está siendo infiel. El programa irá haciendo preguntas que el usuario
*contestará con verdadero o falso. Cada pregunta contestada como verdadero
*sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
*za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
*del programa.
*
*
*
* 
*
*@utor Cyntia Garcia Ruiz
*/

import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
  
    Scanner x = new Scanner(System.in);
    
    System.out.println("Test de infidelidad responde (v) si es verdadero y (f)si es falso:");
    System.out.println("------------------------------------------------------------------");
    
    int resultado = 0;
    int total;
    
    // Preguntas
    
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n: ");
    String pregunta1 = x.nextLine();
    
    if (pregunta1.equals("v")) {
      total = 3;
    } else {
      total = 0;
    }
    
    System.out.print("2. Ha aumentado sus gastos de vestuario.\n: ");
    String pregunta2 = x.nextLine();
    
    if (pregunta2.equals ("v")) {
      total = total + 3;
    } else {
      total = total + 0;
    }
    
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\n: ");
    String pregunta3 = x.nextLine();
    
    if (pregunta3.equals ("v")) {
      total = total + 3;
    } else {
      total = total + 0;
    }
      
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n: ");
    String pregunta4 = x.nextLine();
    
    if (pregunta4.equals ("v")) {
      total = total + 3;
    } else {
      total = total + 0;
    }
      
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\n: ");
    String pregunta5 = x.nextLine();
    
    if (pregunta5.equals ("v")) {
      total = total + 3;
    } else {
      total = total + 0;
    }
      
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n: ");
    String pregunta6 = x.nextLine();
    
    if (pregunta6.equals ("v")) {
      total = total + 3;
    } else {
      total = total + 0;
    }
      
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n: ");
    String pregunta7 = x.nextLine();
    
    if (pregunta7.equals ("v")) {
      total = total + 3;
    } else {
      total = total + 0;
    }
      
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n: ");
    String pregunta8 = x.nextLine();
    
    if (pregunta8.equals ("v")) {
      total = total + 3;
    } else {
      total = total + 0;
    }
      
    System.out.print("9. Has notado que últimamente se perfuma más.\n: ");
    String pregunta9 = x.nextLine();
    
    if (pregunta9.equals ("v")) {
      total = total + 3;
    } else {
      total = total + 0;
    }
      
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n: ");
    String pregunta10 = x.nextLine();
    
    if (pregunta10.equals ("v")) {
      total = total + 1;
    } else {
      total = total + 0;
      }
    // Resultados
    
    if ( total <= 10 ) {
      System.out.print("Todavia te es fiel ;).");
    }
    
    if ( (total > 11 ) && (total <= 22) ) {
      System.out.print("No bajes la guardia, puede tener a alguien en su mente.");    
    }
    
    if ( total >= 22 ) {
      System.out.print("Investiga a fondo el asunto, porque aquí puede que este pasando algo importante con otra persona.");
    }
  }
}
  
