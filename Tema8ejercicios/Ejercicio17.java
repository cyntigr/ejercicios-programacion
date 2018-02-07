package tema8ejercicios;

/**
 *
 * Escribe un programa que pase de binario a decimal.
 *
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import java.util.Scanner;
import tema8ejercicios.matematicas.Ejercicios1a14;
import tema8ejercicios.matematicas.Ejercicios20a28;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.print("Introduce un número en binario : ");
    int binario = x.nextInt();
    int resultado = 0;
    int vuelta;
    int[] exponentes = new int[Ejercicios1a14.digitos(binario)];
    
    for (int i = 0; i < Ejercicios1a14.digitos(binario); i++) {
      if(i == 0){
        exponentes[i] = 1;
      } else{
          exponentes[i] = Ejercicios1a14.potencia(2, i);
      }
    }
    int[] exponentesVolteado = Ejercicios20a28.volteaArray(exponentes);
    for (int i = 0; i < Ejercicios1a14.digitos(binario); i++) {
      
      if(Ejercicios1a14.digitoN(binario,i) == 1){
        resultado += exponentesVolteado[i];
      }
    
    }
    System.out.println(resultado);
  }

}
