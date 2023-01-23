/**
 * 4 Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio4;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> n= new ArrayList<>();
        int longitud = 10;
        String palabra;

        for (int i = 0; i < longitud; i++) {
            System.out.print("Dime una palabra: ");
            palabra = sc.next();
            n.add(palabra);
        }
        
        System.out.println("El array desordenado sería: " + n);
        Collections.sort(n);
        System.out.println("El array ordenado sería: " + n);

        sc.close();
    }   
}
