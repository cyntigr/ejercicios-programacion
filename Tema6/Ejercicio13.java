/*
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 *
 *
 */
package tema6;

/**
 *
 * @author Cintia Garcia Ruiz
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    int dadoUno;
    int dadoDos;
    do{
      dadoUno = ((int)(Math.random() * 6) + 1);
      switch(dadoUno){
        case 1:
          System.out.print("⚀ ");
        case 2:
          System.out.print("⚁ ");
        case 3:
          System.out.print("⚂ ");
        case 4:
          System.out.print("⚃ ");
        case 5:
          System.out.print("⚄ ");
        case 6:
          System.out.print("⚅ ");
      }
      
      dadoDos = ((int)(Math.random() * 6) + 1);
      switch(dadoDos){
        case 1:
          System.out.println("⚀");
        case 2:
          System.out.println("⚁");
        case 3:
          System.out.println("⚂");
        case 4:
          System.out.println("⚃");
        case 5:
          System.out.println("⚄");
        case 6:
          System.out.println("⚅");
      }
      
    } while(dadoUno != dadoDos);
    
  }
  
}
