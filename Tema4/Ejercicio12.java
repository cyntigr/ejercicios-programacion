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
    
    int resultado;
    
    System.out.print("En base de datos se dan los tipos de ficheros: ");
    int pregunta1 = Integer.parseInt(System.console().readLine());
    
    if (pregunta1.equals("verdadero")) {
    int p1 = resultado + 1;
    
    } else {
    int p1 = resultado + 0;
      }
    
    System.out.print("En entornos de desarrollo damos html: ");
    int pregunta2 = Integer.parseInt(System.console().readLine());
    
    if (pregunta2.equals ("verdadero")) {
    int p2 = p1 + 1;
    
    } else {
    int p2 = p1 + 0;
      }
    
    System.out.print("En sistemas nos enseñan a programar: ");
    int pregunta3 = Integer.parseInt(System.console().readLine());
    
    if (pregunta3.equals ("verdadero")) {
    int p3 = p2 + 1;
    
    } else {
    int p3 = p2 + 0;
      }
      
    System.out.print("La base de datos es una estructura de ficheros: ");
    int pregunta4 = Integer.parseInt(System.console().readLine());
    
    if (pregunta4.equals ("verdadero")) {
    int p4 = p3 + 1;
    
    } else {
    int p4 = p3 + 0;
      }
      
    System.out.print("En lenguajes de marca aprendemos css3: ");
    int pregunta5 = Integer.parseInt(System.console().readLine());
    
    if (pregunta5.equals ("verdadero")) {
    int p5 = p4 + 1;
    
    } else {
    int p5 = p4 + 0;
      }
      
    System.out.print("Cada asignatura tiene su temario en moodle: ");
    int pregunta6 = Integer.parseInt(System.console().readLine());
    
    if (pregunta6.equals ("verdadero")) {
    int p6 = p5 + 1;
    
    } else {
    int p6 = p5 + 0;
      }
      
    System.out.print("En fol damos riesgos laborales: ");
    int pregunta7 = Integer.parseInt(System.console().readLine());
    
    if (pregunta7.equals ("verdadero")) {
    int p7 = p6 + 1;
    
    } else {
    int p7 = p6 + 0;
      }
      
    System.out.print("El github sirve para subir trabajos al repositorio: ");
    int pregunta8 = Integer.parseInt(System.console().readLine());
    
    if (pregunta8.equals ("verdadero")) {
    int p8 = p7 + 1;
    
    } else {
    int p8 = p7 + 0;
      }
      
    System.out.print("Los viernes salimos a las 14:15h: ");
    int pregunta9 = Integer.parseInt(System.console().readLine());
    
    if (pregunta9.equals ("verdadero")) {
    int p9 = p8 + 1;
    
    } else {
    int p9 = p8 + 0;
      }
      
    System.out.print("Las clases empiezan a las 08:15h: ");
    int pregunta10 = Integer.parseInt(System.console().readLine());
    
    if (pregunta10.equals ("verdadero")) {
    int p10 = p9 + 1;
    
    } else {
    int p10 = p9 + 0;
      }
    System.out.print("Tienes una puntuación de:" + p10 + " puntos.");
  }
}
