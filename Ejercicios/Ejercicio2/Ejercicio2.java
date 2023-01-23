/**
 * 2 Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        int longitud = (int)(Math.random()*11+10);
        int suma = 0;
        int minimo = 100;
        int maximo = 0;
        
        for (int i = 0; i < longitud; i++) {
            n.add((int)(Math.random()*100));
        }

        for(int a : n){
            suma +=a;
            if(a>maximo){
                maximo = a;
            }
            if(a<minimo){
                minimo = a;
            }
        }

        System.out.println("El Array sería: " + n);
        System.out.println("El máximo es: " + maximo +"\nEl mínimo es: " + minimo + "\nY la suma de sus número es: " + suma);
    }
}
