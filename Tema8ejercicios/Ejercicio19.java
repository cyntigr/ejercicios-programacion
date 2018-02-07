package tema8ejercicios;

import java.util.Scanner;
import tema8ejercicios.matematicas.Ejercicios1a14;
import tema8ejercicios.matematicas.Ejercicios20a28;
/**
 * Une y amplía los dos programas anteriores de tal forma que se permita 
 * convertir un número entre cualquiera de las siguientes bases: decimal,
 * binario, hexadecimal y octal.
 * 
 * 
 * 
 * @author Cintia García Ruiz 1ºDAM
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Convertir un número entre cualquier base");
    System.out.println("----------------------------------------");
    Scanner x = new Scanner(System.in);
    
    System.out.println("Dime el número que quieres pasar: ");
    int numero = x. nextInt();
    System.out.println("Ahora señala la opcion que quieres: ");
    System.out.println("1-binario-decimal         2-binario-octal");
    System.out.println("3-binario-hexadecimal     4-decimal-binario");
    System.out.println("5-decimal-octal           6-decimal-hexadecimal");
    System.out.println("7-octal-binario           8-octal-decimal");
    System.out.println("9-octal-hexadecimal      10-hexadecimal-decimal");
    System.out.println("11-hexadecimal-binario   12-hexadecimal-octal");
    int opcion = x. nextInt();
    int trozos;
    int resultado = 2;
    int digitos = Ejercicios1a14.digitos(numero);
    int tresCifras = 2;
    switch(opcion){
      case 1:
        System.out.println(Ejercicios20a28.binarioDecimal(numero));
        break;
      case 2:
        if(digitos % 3 == 0){
          trozos = digitos / 3; 
        } else {
          trozos = (digitos / 3) + 1;
        }
        for(int i= 0 ;i < trozos;i++){
          for(int j = 0; j < 3;j++){
            tresCifras = Ejercicios1a14.pegaPorDetras(tresCifras,Ejercicios1a14.digitoN(numero, Ejercicios1a14.digitos(numero)-1));
            Ejercicios1a14.quitaPorDetras(numero,1);
            System.out.println(tresCifras);
          }
        }
        System.out.println(Ejercicios1a14.quitaPorDelante(resultado, 1));
        break;

    }
    
    
  }
}
