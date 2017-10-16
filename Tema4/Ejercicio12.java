/**
*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
*que se imparten en el curso. Cada pregunta acertada sumará un punto. El
*programa mostrará al final la calificación obtenida. Pásale el minicuestionario
*a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
*mientos en las diferentes asignaturas del curso.
*
*
* @utor Cyntia Garcia Ruiz
*/

public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.println("Cuestionario sobre el tema verdadero o falso:");
    System.out.println("---------------------------------------------");
    
    int resultado = 0;
    int total;
    
    System.out.print("En base de datos se dan los tipos de ficheros: ");
    String pregunta1 = System.console().readLine();
    
    if (pregunta1.equals("verdadero")) {
      total = 1;
    } else {
      total = 0;
    }
    
    System.out.print("En entornos de desarrollo damos html: ");
    String pregunta2 = System.console().readLine();
    
    if (pregunta2.equals ("falso")) {
      total = total + 1;
    } else {
      total = total + 0;
    }
    
    System.out.print("En sistemas nos enseñan a programar: ");
    String pregunta3 = System.console().readLine();
    
    if (pregunta3.equals ("falso")) {
      total = total + 1;
    } else {
      total = total + 0;
    }
      
    System.out.print("La base de datos es una estructura de ficheros: ");
    String pregunta4 = System.console().readLine();
    
    if (pregunta4.equals ("falso")) {
      total = total + 1;
    } else {
      total = total + 0;
    }
      
    System.out.print("En lenguajes de marca aprendemos css3: ");
    String pregunta5 = System.console().readLine();
    
    if (pregunta5.equals ("verdadero")) {
      total = total + 1;
    } else {
      total = total + 0;
    }
      
    System.out.print("Cada asignatura tiene su temario en moodle: ");
    String pregunta6 = System.console().readLine();
    
    if (pregunta6.equals ("falso")) {
      total = total + 1;
    } else {
      total = total + 0;
    }
      
    System.out.print("En fol damos riesgos laborales: ");
    String pregunta7 = System.console().readLine();
    
    if (pregunta7.equals ("verdadero")) {
      total = total + 1;
    } else {
      total = total + 0;
    }
      
    System.out.print("El github sirve para subir trabajos al repositorio: ");
    String pregunta8 = System.console().readLine();
    
    if (pregunta8.equals ("verdadero")) {
      total = total + 1;
    } else {
      total = total + 0;
    }
      
    System.out.print("Los viernes salimos a las 14:15h: ");
    String pregunta9 = System.console().readLine();
    
    if (pregunta9.equals ("verdadero")) {
      total = total + 1;
    } else {
      total = total + 0;
    }
      
    System.out.print("Las clases empiezan a las 08:15h: ");
    String pregunta10 = System.console().readLine();
    
    if (pregunta10.equals ("verdadero")) {
      total = total + 1;
    } else {
      total = total + 0;
      }
    System.out.print("Tienes una puntuación de:" + total + " puntos.");
  }
}
