
package tema8ejercicios;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
//import tema8ejercicios.matematicas.Tema8Ejercicios20a28;
import tema8ejercicios.matematicas.Ejercicios1a14;
import tema8ejercicios.matematicas.Ejercicios20a28;


public class Tema8Ejercicios20a28 {
    public static void main(String[] args) {
      int[] array = Ejercicios20a28.generaArrayInt(8, 15, 30);
      int[] arrayMaximo = Ejercicios20a28.generaArrayInt(8, 15, 30);
      
      System.out.println("1 " + Ejercicios20a28.mediaArray(array));
      
      Ejercicios20a28.muestraArray(Ejercicios20a28.generaArrayInt(8, 15, 30));
      Ejercicios20a28.muestraArray(array);
      Ejercicios20a28.muestraArray(arrayMaximo);
      System.out.println("2 " + Ejercicios20a28.maximoArrayInt(arrayMaximo));
      System.out.println("3 " + Ejercicios20a28.minimoArrayInt(array));
      Ejercicios20a28.volteaArray(Ejercicios20a28.generaArrayInt(8, 15, 30));
      Ejercicios20a28.muestraArray(array);
      Ejercicios20a28.muestraArray(Ejercicios20a28.rotaDerechaArrayInt(array, 3));
      Ejercicios20a28.muestraArray(Ejercicios20a28.rotaIzquierdaArrayInt(array, 3));
      
    }

}
