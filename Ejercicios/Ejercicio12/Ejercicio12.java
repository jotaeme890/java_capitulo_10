/**
 * 12 Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
 * el resto de cartas no vale nada.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio12;

import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        ArrayList<Carta> c = new ArrayList<Carta>();
        HashMap<String, Integer> h = new HashMap<String,Integer>();

        //AÑADIMOS LAS CLAVES Y LOS VALORES AL HASHMAP, SIENDO LOS VALORES LA PUNTUACIÓN
        h.put("as", 11);
        h.put("dos", 0);
        h.put("tres", 10);
        h.put("cuatro", 0);
        h.put("cinco", 0);
        h.put("seis", 0);
        h.put("siete", 0);
        h.put("sota", 2);
        h.put("caballo", 3);
        h.put("rey", 4);

        //CREAREMOS LA CARTA QUE USAREMOS PARA CONTROLAR SI SE REPITEN
        Carta cartaAux = new Carta();
        //LA AÑADIMOS PARA COMPARAR
        c.add(cartaAux);
        //AHORA HAREMOS QUE LA CARTA NO SE REPITA
        for (int i = 0; i < 5; i++) {
            do {
                cartaAux = new Carta();
            } while (c.contains(cartaAux));
            c.add(cartaAux);
        }

        int puntos = 0;

        for (Carta carta : c) {
            System.out.println(carta);
            puntos += h.get(carta.getFigura());
        }

        System.out.println("Tus puntos totales son: " + puntos);

    }
}
