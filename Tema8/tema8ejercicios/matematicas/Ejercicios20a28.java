
package tema8ejercicios.matematicas;

/**
 *
 * 
 * 
 * @author cyntia
 */
public class Ejercicios20a28 {
  
  /**
   * Genera un array de tamaño n con números aleatorios 
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * 
   * @param tamano tamaño array
   * @param minimo 
   * @param maximo
   * @return array generado
   */
  public static int[] generaArrayInt(int tamano,int minimo,int maximo) {
    int array[] = new int[tamano];
    
    for(int i = 0;i<tamano;i++){
      
      array[i] = (int) (Math.random() * (maximo-minimo))+ minimo;
      
    }
    return array;
  }

  public static int[] minimoArrayInt(int x[]) {
    
    int [] = 
    
    for(int i = 0;i<tamano;i++){
    
      
    }
    return array;

  }
  
  public static void muestraArray(int x[]) {
    
    for (int n : x){
      System.out.print(n + " ");
  }
      System.out.println(" ");
 }
  public static int[] volteaArray(int x[]) {
    
    int y[] = new int[x.length];
    int j = 0;
    for (int i = x.length-1;i >=0 ;i--){
      y[j] = x[i];
      j++;
    }
    return y;
 }
 
}

