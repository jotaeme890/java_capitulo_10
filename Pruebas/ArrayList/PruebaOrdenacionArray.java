package Pruebas.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class PruebaOrdenacionArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(67);
        a.add(78);
        a.add(10);
        a.add(4);
        System.out.println("\nNúmeros en el orden original:");
        for (int numero: a) {
            System.out.println(numero);
        }
        //ORDENA DE MENOR A MAYOR, ES DECIR (4,10,67,78)
        Collections.sort(a);
        
        System.out.println("\nNúmeros ordenados:");
        for (int numero: a) {
            System.out.println(numero);
        }
    }
}

