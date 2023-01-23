/**
 * 3 Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio3;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n= new ArrayList<>();
        int longitud = 10;
        int numero = 0;

        for (int i = 0; i < longitud; i++) {
            System.out.print("Dime un número: ");
            numero = sc.nextInt();
            n.add(numero);
        }
        System.out.println("El array desordenado sería: " + n);
        Collections.sort(n);
        System.out.println("El array ordenado sería: " + n);

        sc.close();
    }   
}
