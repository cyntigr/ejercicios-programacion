package tema8ejercicios.matematicas;

public class Ejercicios1a14 {

  /**
   * Comprueba si un número entero positivo es primo o no
   * Un número es primo cuando únicamente es divisible entre él mismo 
   * y la unidad.
   *
   * @param x un número entero positivo
   * @return true si el número es primo y false en caso contrario
   */
  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Busca el siguiente primo de un número.
   * Sumas uno cada vez y compruebas si es primo
   *
   * @param x número entero positivo
   * @return número primo siguiente al introducido
   */
  public static int siguientePrimo(int x) {
    do {
      x++;
    } while (!esPrimo(x));
    return x;
  }

  /**
   * Devuelve el resultado de una potencia.
   * Multiplica un número por si mismo tantas veces como se indica
   *
   * @param x base
   * @param y exponente
   * @return calculo de una potencia
   */
  public static int potencia(int x, int y) {
    int resultadoPotencia = x;

    for (int i = 1; i < y; i++) {

      resultadoPotencia *= x;
    }
    return resultadoPotencia;
  }

  /**
   * Voltea un número.
   * Da la vuelta a un número Quita el último número y lo pones al principio
   * 
   * @param x número entero
   * @return número volteado
   */
  public static int voltea(int x) {
    int vuelta = 0;
    while (x > 0) {
      vuelta = (vuelta * 10) + (x % 10);
      x /= 10;
    }
    return vuelta;
  }

  /**
   * Cuenta los dígitos de un número entero.
   * Quita número a número y los cuenta
   *
   * @param x número entero
   * @return número de dígitos
   */
  public static int digitos(long x) {
    int cuenta = 0;
    while (x > 0) {
      x /= 10;
      cuenta++;
    }
    return cuenta;
  }

  public static int digitos(int x) {
    return digitos((long) x);
  }

  /**
   * Comprueba si es Capicúa.
   * Voltea el número introducido y comprueba si es igual al introducido
   *
   * @param x número entero
   * @return true si el número es capicúa y false en caso contrario
   */
  public static boolean esCapicua(int x) {

    return x == voltea(x);
  }

  /**
   * Devuelve un dígito n concreto.
   * Cuenta de izquierda a derecha y saca el dígito
   *
   * @param x número entero
   * @param n posición dígito
   * @return digito seleccionado
   */
  public static int digitoN(long x, int n) {

    int numero = digitos(x) - n - 1;
    
    for(int i = 0;i < numero;i++){
      x /= 10;
    }
    x %= 10;
    return (int)x;
  }

  public static int digitoN(int x, int n) {

    return digitoN((long) x, n);
  }

  /**
   * Devuelve la posición de un dígito.
   * Cuenta de izquierda a derecha y saca el dígito
   *
   * @param x número entero
   * @param n dígito del que quiero saber la posición
   * @return digito seleccionado o -1 si no se encuentra
   */
  public static int posicionDeDigito(int x, int n) {
    int copia = x;
    int numero;
    int posicion = 0;
    do {
      numero = x % 10;
      x /= 10;
      posicion++;
    } while ((n != numero) && (posicion < digitos(copia)));
    if (n == numero) {
      return digitos(copia) - posicion;
    } else {
      return -1;
    }
  }

  /**
   * Quita un número por la parte de atrás.
   * Dividimos por 10 tantas veces como dígitos quieras quitar
   *
   * @param x número entero
   * @param y dígitos que quita
   * @return número sin los dígitos señalados
   */
  public static int quitaPorDetras(int x, int y) {
    
    for(int i = 0; i < y; i++){
      x /= 10;
    }
    return x;
  }

  /**
   * Quita un número por la parte de delante.
   * Volteamos y dividimos por 10 tantas veces como dígitos quieras quitar
   *
   * @param x número entero
   * @param y dígitos que quita
   * @return número sin los dígitos señalados en la parte de delante
   */
  public static int quitaPorDelante(int x, int y) {
    return voltea(quitaPorDetras(voltea(x),y));
  }
  
  /**
   * Añade un número detras a un número entero dado
   * Multiplicamos por 10 para aumentar el numero y poder sumar "y"
   * 
   * @param x número entero
   * @param y dígito que añade
   * @return número completo
   */
  public static int pegaPorDetras(int x, int y) {
    return x * 10 + y;
  }
  
  /**
   * Añade un número delante a un número entero dado
   * Voltea el número, pegamos por detrás el número y voltea
   * 
   * @param x número entero
   * @param y dígito que añade
   * @return número completo
   */
  public static int pegaPorDelante(int x, int y) {
    return voltea(pegaPorDetras(voltea(x),y));
  }
  
  /**
   * Devuelve un trozo de número.
   * Toma como parámetros las posiciones inicial y final 
   * dentro de un número y devuelve el trozo correspondiente
   * 
   * @param x número entero
   * @param y posición inicial
   * @param z posición final
   * @return trozo de número
   */
  public static int trozoDeNumero(int x, int y, int z) {
    int trozo = 0;
    do{
      trozo = pegaPorDetras(trozo,digitoN(x,y));
      y++;
    } while(y <= z);
    return trozo ;
  }
  
  /**
   * Une dos números en uno solo.
   * 
   * 
   * @param x número entero
   * @param y número entero
   * @return número completo
   */
  public static int juntaNumeros(int x, int y) {
    return (potencia(10,digitos(y)) * x) + y;
    
  }
}
