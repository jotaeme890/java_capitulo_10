/**
 * 10 Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio10;

import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HashMap <String,String> h = new HashMap<String,String>();
        String palabra = "";
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


        System.out.println("Bienvenido al traductor");
        System.out.println("¿Qué palabra quiere traducir?");
        System.out.print("Palabra que quiere traducir: ");
        palabra = sc.nextLine();
        //SI palabra EXISTE EN EL HASHMAP MOSTRAMOS SU TRADUCCIÓN, SI NO NO EXISTE  
        if(h.containsKey(palabra)){
            System.out.println("Su traducción es: " + h.get(palabra));
        } else{
            System.out.println("Lo siento, esa palabra no está registrada");
        }
        sc.close();
    }   
}
