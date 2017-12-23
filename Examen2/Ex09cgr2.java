/**
*
* Examen 02 programación,04-12-2017.
*
* Realiza un programa que muestre la previsión del tiempo para mañana en Málaga. Las temperaturas
* máxima y mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos
* absolutos medidos en las últimas décadas para cada estación. La probabilidad de que esté soleado o
* nublado en cada estación se proporciona a continuación. Obviamente, la temperatura mínima deberá
* ser menor o igual que la temperatura máxima.
* 
* @author Cintia Garcia Ruiz
* 1ºDAM
* 
*/

import java.util.Scanner;
 
public class Ex09cgr2{
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.println("Seleccione la estación del año (1-4): ");
    int estacion = x.nextInt();
    int minima;
    int maxima;
    int alta;
    int baja;
    int dia;
    int soleado;
    int nublado;
    System.out.println("Previsión del tiempo para mañana");
    System.out.println("--------------------------------");
    switch(estacion){
      case 1:
        
        minima = (int)(Math.random() * 15) + 15;
        maxima = (int)(Math.random() * 15) + 15;
        if(minima > maxima){
          alta = minima;
          baja = maxima;
        } else{
            alta = maxima;
            baja = minima;
          }
        System.out.println("Temperatura mínima: " + baja + " ºC");
        System.out.println("Temperatura máxima: " + alta + " ºC");
        dia = (int) (Math.random() * 10)+1;
        switch (dia) {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
            System.out.print("Soleado");
            break;
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.print("Nublado");
            break;
        }
        break;
      case 2:
        minima = (int)(Math.random() * 20) + 25;
        maxima = (int)(Math.random() * 20) + 25;
        dia = (int) (Math.random() * 10)+1;
        if(minima > maxima){
          alta = minima;
          baja = maxima;
        } else{
            alta = maxima;
            baja = minima;
          }
        System.out.println("Temperatura mínima: " + baja + " ºC");
        System.out.println("Temperatura máxima: " + alta + " ºC");
        switch (dia) {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
            System.out.print("Soleado");
            break;
          case 9:
          case 10:
            System.out.print("Nublado");
            break;
        }
        break;
      case 3:
        minima = (int)(Math.random() * 10) + 20;
        maxima = (int)(Math.random() * 10) + 20;
        if(minima > maxima){
          alta = minima;
          baja = maxima;
        } else{
            alta = maxima;
            baja = minima;
          }
        System.out.println("Temperatura mínima: " + baja + " ºC");
        System.out.println("Temperatura máxima: " + alta + " ºC");
        dia = (int) (Math.random() * 10)+1;
        switch (dia) {
          case 1:
          case 2:
          case 3:
          case 4:
            System.out.print("Soleado");
            break;
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.print("Nublado");
            break;
        }
        break;
      case 4:
        minima = (int)(Math.random() * 25);
        maxima = (int)(Math.random() * 25);
        if(minima > maxima){
          alta = minima;
          baja = maxima;
        } else{
            alta = maxima;
            baja = minima;
          }
        System.out.println("Temperatura mínima: " + baja + " ºC");
        System.out.println("Temperatura máxima: " + alta + " ºC");
        dia = (int) (Math.random() * 10)+1;
        switch (dia) {
          case 1:
          case 2:
            System.out.print("Soleado");
            break;
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
            System.out.print("Nublado");
            break;
        }
        break;
    }
    
  }
}
