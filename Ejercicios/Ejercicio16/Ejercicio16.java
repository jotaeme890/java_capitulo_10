/**
 * 16 Realiza un programa que sepa decir la capital de un país (en caso de conocer
 * la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
 * principio, el programa solo conoce las capitales de España, Portugal y Francia.
 * Estos datos deberán estar almacenados en un diccionario. Los datos sobre
 * capitales que vaya aprendiendo el programa se deben almacenar en el mismo
 * diccionario. El usuario sale del programa escribiendo la palabra “salir”.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Paises paises = new Paises();

        boolean salir = false;

        do {
            String pais = sc.nextLine();
            String capital = paises.getCapital(pais);
            if(capital!=null){
                System.out.println("La capital de " + pais + " es: " + capital);
            } else{
                System.out.print("No se la capital de " + pais + " ¿Cuál es?");
                capital = sc.nextLine();
                paises.anade(pais, capital);
                System.out.println("Añadido correctamente");
            }
        } while (salir);
        sc.close();
    }
}
