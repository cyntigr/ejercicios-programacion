package tema8ejercicios1a14.matematicas;
public class Ejercicios1a14 {
  /**
   * Comprueba si un número entero positivo es primo o no
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return  true si el número es primo y false en caso contrario
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
   * @param x número entero positivo
   * @return  número primo siguiente al introducido
   */
  public static int siguientePrimo(int x) {
    do{
      x++;
    } while(!esPrimo(x));
    return x;
  }
  
  /**
   * Devuelve el resultado de una potencia.
   * Multiplica un número por si mismo tantas veces como se indica
   * @param x base
   * @param y exponente
   * @return  calculo de una potencia
   */
  public static int potencia (int x, int y) {
    int resultadoPotencia = x;
    
    for(int i = 1;i < y; i++){
      
      resultadoPotencia *= x;
    }
    return resultadoPotencia;
  }
  
  /**
   * Da la vuelta a un número
   * Quita el último número y lo pones al principio 
   * @param x 
   * @return  número volteado
   */
  public static int voltea (int x) {
    int vuelta = 0;
    while (x > 0) {
      vuelta = (vuelta * 10) + (x % 10);
      x /= 10;
    }
    return vuelta;
  }

  /**
   * Cuenta los dígitos de un número entero
   * Quita número a número y los cuenta 
   * @param x 
   * @return  número de dígitos
   */
  public static int cuentaDigitos (int x) {
    int cuenta = 0;
    while (x > 0) {
      x /= 10;
      cuenta++;
    }
    return cuenta;
  }
  
  /**
   * Comprueba si es Capicúa
   * Voltea el número introducido y comprueba si es igual al introducido
   * @param x 
   * @return  true si el número es capicúa y false en caso contrario
   */
  public static boolean esCapicua (int x) {
    int vuelta = 0;
    int capicua = x;
    while (x > 0) {
      vuelta = (vuelta * 10) + (x % 10);
      x /= 10;
    }
    if(vuelta == capicua){
    return true;
    }
    return false;
  }
  
  /**
   * Devuelve un dígito n concreto
   * Cuenta de izquierda a derecha y saca el dígito
   * @param x
   * @param n
   * @return  digito seleccionado
   */
  public static int digitoN (int x,int n) {
    int numero = x;
    int cuenta = 0;
    while (x > 0) {
      x /= 10;
      cuenta++;
    }
    for(int i = 0;i < cuenta-n;i++){
      numero /= 10;
    }
    numero %= 10;
    return numero;
  }
  
  /**
   * Devuelve un dígito n concreto
   * Cuenta de izquierda a derecha y saca el dígito
   * @param x
   * @param n
   * @return  digito seleccionado o -1 si no se encuentra
   */
  public static int posicionDeDigito (int x,int n) {
    int numero;
    int posicion = 0;
    do{
      numero = x % 10;
      x /= 10;
      posicion++;
    } while (n != numero);
    return posicion;
  }
  
  /**
   * Quita un número por la parte de atrás
   * Dividimos por 10 tantas veces como dígitos quieras quitar
   * @param x
   * @param y
   * @return  número sin los dígitos señalados
   */
  public static int quitaPorDetras (int x,int y) {
    do{
     x /= 10;
     y--;
    } while (y > 0);
    return x;
  }
  
  /**
   * Quita un número por la parte de delante
   * Volteamos y dividimos por 10 tantas veces como dígitos quieras quitar
   * @param x
   * @param y
   * @return  número sin los dígitos señalados en la parte de delante
   */
  public static int quitaPorDelante (int x,int y) {
    int vuelta = 0;
    while (x > 0) {
      vuelta = (vuelta * 10) + (x % 10);
      x /= 10;
    }
    do{
     vuelta /= 10;
     y--;
    } while (y > 0);
    while (vuelta > 0) {
      x = (x * 10) + (vuelta % 10);
      vuelta /= 10;
    }
    return x;
  }
  
   /**
   * Quita un número por la parte de delante
   * Volteamos y dividimos por 10 tantas veces como dígitos quieras quitar
   * @param x
   * @param y
   * @return  número sin los dígitos señalados en la parte de delante
   */
  public static int quitaPorDelante (int x,int y) {
    int vuelta = 0;
    while (x > 0) {
      vuelta = (vuelta * 10) + (x % 10);
      x /= 10;
    }
    do{
     vuelta /= 10;
     y--;
    } while (y > 0);
    while (vuelta > 0) {
      x = (x * 10) + (vuelta % 10);
      vuelta /= 10;
    }
    return x;
  }
}
