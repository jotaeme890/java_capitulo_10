/**
 * 9 Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. 
 * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio9;

import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Carta> m = new ArrayList<Carta>();
    
        Carta aux = new Carta();
        m.add(aux);
    
        for (int i = 0; i < 9; i++) {
            do {
                aux = new Carta();
            } while (m.contains(aux));
            m.add(aux);
        }

        Collections.sort(m);

        for (Carta carta : m) {
            System.out.println(carta);
        }
    }
}
