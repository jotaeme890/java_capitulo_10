/**
 * 11 Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior. 
 * El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de las palabras y comprobará 
 * si son correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas y cuántas erróneas.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio11;

import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HashMap <String,String> h = new HashMap<String,String>();
        //AÑADIMOS LAS PALABRAS AL DICCIONARIO
        h.put("ordenador", "computer");
        h.put("gato", "cat");
        h.put("rojo", "red");
        h.put("árbol", "tree");
        h.put("pingüino", "penguin");
        h.put("sol", "sun");
        h.put("agua", "water");
        h.put("viento", "wind");
        h.put("siesta", "siesta");
        h.put("arriba", "up");
        h.put("ratón", "mouse");
        h.put("estadio", "arena");
        h.put("calumnia", "aspersion");
        h.put("aguacate", "avocado");
        h.put("cuerpo", "body");
        h.put("concurso", "contest");
        h.put("cena", "dinner");
        h.put("salida", "exit");
        h.put("lenteja", "lentil");
        h.put("cacerola", "pan");
        h.put("pastel", "pie");
        h.put("membrillo", "quince");

        //GUARDAMOS TODAS LAS CLAVES EN UN ARRAY, ES DECIR, LAS PALABRAS EN ESPAÑOL QUE VAMOS A MOSTRAR PARA QUE SE TRADUZCAN
        String [] espanol = h.keySet().toArray(new String[0]);

        ArrayList <Integer> nAle = new ArrayList<Integer>();
        //LE METEMOS EL PRIMER ALEATORIO PARA QUE TENERLO DE BASE PARA QUE NO SE REPITA
        nAle.add((int)(Math.random()*22));
        //CON ESTA VARIABLE COMPARAREMOS LOS NÚMEROS
        int numero = 0;
        //CREAMOS LOS 5 NÚMEROS DIFERENTES
        for (int i = 0; i<5 ; i++) {
            do {
                numero = ((int)(Math.random()*22));
            } while (nAle.contains(numero));
            nAle.add(numero);
        }

        System.out.println("Las palabras para traducir son: ");
        int correcto = 0;
        int incorrecto = 0;

        for (int i = 0; i < 5; i++) {
            //CON ESTO LO QUE HACEMOS ES ESCRIBIR LO QUE HAYAMOS ALMACENADO EN EL ARRAY ESPANOL, EN EL ÍNDICE QUE LO SACAMOS DE LOS NÚMEROS ALEATORIOS, Y AL SER UN ARRAYLIST USAMOS .get(i)
            System.out.print(espanol[nAle.get(i)] + " : ");
            //LEEMOS LA PALABRA QUE SERÍA LA TRDUCCCIÓN AL INGLÉS
            String palabra = sc.nextLine();
            //SI LA PALABRA INTRODUCIDA ES IGUAL AL VALOR DE LA CLAVE DEL HASHMAP, SIENDO LA CLAVE, LA POSICION QUE SE OBTIENE DEL ARRAY DE PALABRAS 
            if(palabra.equals(h.get(espanol[nAle.get(i)]))){
                System.out.println("Has acertado!");
                correcto++;
            } else{
                System.out.println("Esa no es su traducción, la correcta es," + h.get(espanol[nAle.get(i)]));
                incorrecto++;
            }
        }

        System.out.println("Has tenido un total de " + correcto + " aciertos y " + incorrecto + " fallos");
        sc.close();
    }
}
