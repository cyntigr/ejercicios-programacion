package tema8ejercicios.matematicas;

/**
 *
 * @author cyntia
 */
import tema8ejercicios.matematicas.Ejercicios20a28;
import tema8ejercicios.matematicas.Ejercicios1a14;

public class Ejercicio29a34 {

  /**
   * Genera un array de tamaño n x m con números aleatorios cuyo intervalo
   * (mínimo y máximo) se indica como parámetro.
   *
   * @param fila número de filas
   * @param columna número de columnas
   * @param minimo número mínimo del intervalo de los números del array
   * @param maximo número máximo del intervalo de los números del array
   */
  public static int[][] generaArrayBiInt(int fila, int columna, int minimo, int maximo) {
    int array[][] = new int[fila][columna];

    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
        array[i][j] = (int) (Math.random() * (maximo - minimo)) + minimo + 1;
      }
    }
    return array;
  }

  public static void muestraArrayBiInt(int array[][]) {

    System.out.print("       ");
    for (int j = 0; j < array[0].length; j++) {
      System.out.print("   Columna " + j);
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print("\nFila " + i);
      for (int j = 0; j < array[0].length; j++) {
        System.out.printf("%9d   ", array[i][j]);
      }
    }
  }

  /**
   * Devuelve la fila de un array.
   *
   * @param array es un array bidimensional
   * @param x fila del array que queremos
   *
   * @return fila array.
   */
  public static int[] filaArrayBiInt(int array[][], int x) {
    int fila[] = new int[array[0].length];

    for (int j = 0; j < array[0].length; j++) {
      fila[j] = array[x][j];
    }
    return fila;
  }

  /**
   * Devuelve la columna de un array.
   *
   * @param array es un array bidimensional
   * @param x culumna del array que queremos
   *
   * @return columna array.
   */
  public static int[] columnaArrayBiInt(int array[][], int x) {
    int columna[] = new int[array.length];

    for (int j = 0; j < array.length; j++) {
      columna[j] = array[j][x];
    }
    return columna;
  }

  /**
   * Devuelve las coordenadas de un número introducido, de un array dado.
   *
   * @param array es un array bidimensional
   * @param x número que encontrar en el array
   *
   * @return coordenadas es un array con las coordenadas del número introducido
   * y -1 -1 en el caso de no encontrarse en el array.
   */
  public static int[] coordenadasEnArrayBiInt(int array[][], int x) {
    int coordenadas[] = new int[2];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (array[i][j] == x) {
          coordenadas[0] = i;
          coordenadas[1] = j;
        } else {
          coordenadas[0] = -1;
          coordenadas[1] = -1;
        }

      }
    }
    return coordenadas;
  }

  /**
   * Devuelve si las coordenadas son o no pundo de silla.
   *
   * @param array es un array bidimensional
   * @param x fila del array
   * @param y columna del array
   *
   * @return true si es verdadero y false si es falso
   */
  public static boolean esPuntoDeSilla(int array[][], int x, int y) {

    int[] fila = filaArrayBiInt(array, x);
    int[] columna = columnaArrayBiInt(array, y);

    return ((Ejercicios20a28.minimoArrayInt(fila) == array[x][y]) && (Ejercicios20a28.maximoArrayInt(columna) == array[x][y]));
  }

  /**
   * Devuelve las coordenadas de la diagonal que le indiques.
   *
   * @param array es un array bidimensional
   * @param fila fila del array
   * @param columna columna del array
   * @param direccion es el sentido de la diagonal
   *
   * @return diagonal
   */
  public static int[] diagonal(int array[][], int fila, int columna, String direccion) {
    int nFilas = array[0].length - fila;
    int nColumnas = array.length - columna;
    int dimension;
    if (nFilas < nColumnas) {
      dimension = nFilas;
    } else {
      dimension = nColumnas;
    }
    int diagonal[] = new int[dimension];
    diagonal[0] = array[fila][columna];
    int j = 1;
    switch (direccion) {
      case "nose":
        do {
          diagonal[j++] = array[++fila][++columna];

        } while (fila < array[0].length - 1 && columna < array.length - 1);
        break;
      case "neso":
        do {
          diagonal[j++] = array[++fila][--columna];

        } while (columna > 0 && fila < array[0].length - 1);
        break;
      default:
    }

    return diagonal;
  }

  /**
   * Devuelve un array con los números primos que haya en otro array dado
   *
   *
   * @param x es un array dado como parametro
   *
   * @return primos array con números primos
   */
  public static int[] filtraPrimos(int x[]) {
    int cuentaPrimos = 0;
    for (int n : x) {
      if (Ejercicios1a14.esPrimo(n)) {
        cuentaPrimos++;
      }
    }
    int primos[] = new int[cuentaPrimos];
    int i = 0;
    if (cuentaPrimos == 0) {
      int[] aux = {-1};
      return aux;
    } else {
      for (int b : x) {
        if (Ejercicios1a14.esPrimo(b)) {
          primos[i++] = b;
        }
      }
    }
    return primos;
  }
  
  /**
   * Devuelve un array con los números capicúa que haya en otro array dado
   *
   *
   * @param x es un array dado como parametro
   *
   * @return capicua array con números capicúa
   */
  public static int[] filtraCapicuas(int x[]){
    int cuentaCapicua = 0;
    for (int n : x) {
      if (Ejercicios1a14.esCapicua(n)) {
        cuentaCapicua++;
      }
    }
    int capicua[] = new int[cuentaCapicua];
    int i = 0;
    if (cuentaCapicua == 0) {
      int[] aux = {-1};
      return aux;
    } else {
      for (int b : x) {
        if (Ejercicios1a14.esCapicua(b)) {
          capicua[i++] = b;
        }
      }
    }
    return capicua;
  }
  public static int[] filtraCon7(int x[]){
    int cuentaSiete = 0;
    for (int n : x) {
      if (Ejercicios1a14.posicionDeDigito(n,7) > -1) {
        cuentaSiete++;
      }
    }
    int conSiete[] = new int[cuentaSiete];
    int i = 0;
    if (cuentaSiete == 0) {
      int[] aux = {-1};
      return aux;
    } else {
      for (int b : x) {
        if (Ejercicios1a14.posicionDeDigito(b,7) > -1) {
          conSiete[i++] = b;
        }
      }
    }
    return conSiete;
  }
  
}
