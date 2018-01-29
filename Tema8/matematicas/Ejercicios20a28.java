package tema8ejercicios.matematicas;

/**
 *
 *
 *
 * @author cyntia
 */
import tema8ejercicios.matematicas.Ejercicios1a14;

public class Ejercicios20a28 {

  /**
   * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
   * máximo) se indica como parámetro.
   *
   *
   * @param tamano tamaño array
   * @param minimo
   * @param maximo
   * @return array generado
   */
  public static int[] generaArrayInt(int tamano, int minimo, int maximo) {
    int array[] = new int[tamano];

    for (int i = 0; i < tamano; i++) {

      array[i] = (int) (Math.random() * (maximo - minimo)) + minimo;

    }
    return array;
  }

  /**
   * Devuelve el mínimo número dentro de un array.
   *
   *
   * @param x array
   * @return mínimo
   */
  public static int minimoArrayInt(int[] x) {

    int minimo = Integer.MAX_VALUE;

    for (int i = 0; i < x.length; i++) {

      if (x[i] < minimo) {
        minimo = x[i];
      }
    }
    return minimo;

  }

  /**
   * Devuelve el mínimo número dentro de un array.
   *
   *
   * @param x array
   * @return mínimo
   */
  public static int maximoArrayInt(int[] x) {

    int maximo = Integer.MIN_VALUE;

    for (int i = 0; i < x.length; i++) {

      if (x[i] > maximo) {
        maximo = x[i];
      }
    }
    return maximo;

  }

  public static void muestraArray(int x[]) {

    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println(" ");
  }

  public static int[] volteaArray(int x[]) {

    int y[] = new int[x.length];
    int j = 0;
    for (int i = x.length - 1; i >= 0; i--) {
      y[j] = x[i];
      j++;
    }
    return y;
  }

  /**
   * Pasa de decimal a binario un número entero.
   *
   *
   * @param decimal número decimal introducido
   * @return binario
   */
  public static int decimalBinario(int decimal) {
    if (decimal == 1) {
      return 1;
    }
    int binario = 0;
    boolean uno = false;
    int cuenta = 0;
    if (decimal == 1) {

    }
    do {
      binario = Ejercicios1a14.pegaPorDetras(binario, decimal % 2);
      if ((decimal % 2 == 0) && (!uno)) {
        cuenta++;
      } else {
        uno = true;
      }
      decimal /= 2;

    } while (decimal > 1);

    binario = Ejercicios1a14.pegaPorDetras(binario, 1);
    binario = Ejercicios1a14.voltea(binario);
    for (int i = 0; i < cuenta; i++) {
      binario = Ejercicios1a14.pegaPorDetras(binario, 0);
    }
    return binario;

  }

  /**
   * Pasa de decimal a binario un número entero.
   *
   *
   * @param binario número binario introducido
   * @return resultado
   */
  public static int binarioDecimal(int binario) {

    int resultado = 0;
    int vuelta;
    int[] exponentes = new int[Ejercicios1a14.digitos(binario)];

    for (int i = 0; i < Ejercicios1a14.digitos(binario); i++) {
      if (i == 0) {
        exponentes[i] = 1;
      } else {
        exponentes[i] = Ejercicios1a14.potencia(2, i);
      }
    }
    int[] exponentesVolteado = Ejercicios20a28.volteaArray(exponentes);
    for (int i = 0; i < Ejercicios1a14.digitos(binario); i++) {

      if (Ejercicios1a14.digitoN(binario, i) == 1) {
        resultado += exponentesVolteado[i];
      }
    }
    return resultado;
  }

  public static int mediaArray(int x[]) {
    int media = 0;
    for (int i = 0; i < x.length; i++) {
      media += x[i];
    }
    return media / x.length;
  }

  public static boolean estaEnArrayInt(int x[], int n) {
    boolean esta = false;
    for (int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        esta = true;
      }
    }
    return esta;
  }

  public static int posicionEnArray(int x[], int n) {
    int posicion = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        posicion = i;
      }
    }
    return posicion;
  }

  public static int[] rotaDerechaArrayInt(int x[], int n) {
    int y[] = duplicaArray(x);

    for (int i = 0; i < n; i++) {
      y = rotaDerechaArrayIntUna(y);
    }

    return y;
  }

  public static int[] rotaDerechaArrayIntUna(int x[]) {

    int y[] = new int[x.length];
    int tamanoArray = x.length;
    y[0] = x[tamanoArray - 1];
    for (int i = 0; i <= tamanoArray - 2; i++) {
      y[i + 1] = x[i];
    }

    return y;
  }

  public static int[] duplicaArray(int x[]) {
    int y[] = new int[x.length];

    for (int i = 0; i < x.length; i++) {
      y[i] = x[i];
    }
    return y;
  }

  public static int[] rotaIzquierdaArrayIntUna(int x[]) {
    int y[] = new int[x.length];
    int tamanoArray = x.length;

    y[tamanoArray - 1] = x[0];
    for (int i = 0; i <= tamanoArray - 2; i++) {
      y[i] = x[i + 1];
    }
    return y;
  }

  public static int[] rotaIzquierdaArrayInt(int x[], int n) {
    int y[] = duplicaArray(x);

    for (int i = 0; i < n; i++) {
      y = rotaIzquierdaArrayIntUna(y);
    }
    return y;
  }

}
