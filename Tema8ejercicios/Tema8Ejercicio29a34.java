package tema8ejercicios;

/**
 *
 * @author Cintia García Ruiz 1ºDAM
 */
import tema8ejercicios.matematicas.Ejercicio29a34;
import tema8ejercicios.matematicas.Ejercicios20a28;
public class Tema8Ejercicio29a34 {

  public static void main(String[] args) {
    int arrayBi[][] = Ejercicio29a34.generaArrayBiInt(5, 5, 10, 50);
    int array[] = Ejercicios20a28.generaArrayInt(15, 3, 50);
    
    Ejercicio29a34.muestraArrayBiInt(arrayBi);
    
    System.out.print("\nFila 2: ");
    Ejercicios20a28.muestraArray(Ejercicio29a34.filaArrayBiInt(arrayBi, 2));
    System.out.print("\nColumna 4: ");
    Ejercicios20a28.muestraArray(Ejercicio29a34.columnaArrayBiInt(arrayBi, 4));
    System.out.print("\nCoordenadas del número 18 (fila, columna): ");
    Ejercicios20a28.muestraArray(Ejercicio29a34.coordenadasEnArrayBiInt(arrayBi, 18));
    Ejercicios20a28.muestraArray(Ejercicio29a34.diagonal(arrayBi,1, 1, "nose"));
    
    Ejercicios20a28.muestraArray(array);
    Ejercicios20a28.muestraArray(Ejercicio29a34.filtraPrimos(array));
    Ejercicios20a28.muestraArray(Ejercicio29a34.filtraCapicuas(array));
    Ejercicios20a28.muestraArray(Ejercicio29a34.filtraCon7(array));
  }

}
