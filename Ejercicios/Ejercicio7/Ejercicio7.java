/**
 * 7 La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio7;

import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        //CREAMOS EL ARRAYLIST DE LAS MONEDAS
        ArrayList<Moneda> m = new ArrayList<Moneda>();
        //CREAMOS UN AUX DE LA MONEDA
        Moneda aux = new Moneda();
        m.add(aux);

        //GUARDAMOS EL LADO Y LA CANTIDAD DEL AUX EN UNAS VARIABLES 
        String ultimoLado = aux.getLado();
        String ultimaCant = aux.getValor();

        for (int i = 0; i < 5; i++) {
            //TENEMOS QUE CALCULAR EL VALOR DEL AUX
            do {
                aux = new Moneda();
                //CUANDO SEA IGUAL EL LADO AL ULTIMO ALMACENADO Y EL VALOR SEA EL ULTIMO VALOR ALMACENADO
            } while ((!aux.getLado().equals(ultimoLado)) && (!aux.getValor().equals( ultimaCant)));
            //SE AÑADE YA QUE ES POR QUE SERÍA YA IGUAL AL LADO O AL VALOR ANTERIOR
            m.add(aux);
            //PONEMOS DE NUEVO LOS VALORES DE LOS ANTERIORES
            ultimoLado = aux.getLado();
            ultimaCant = aux.getValor();
        }
        //IMPRIMIMOS EL ARRAY
        for (Moneda moneda : m) {
            System.out.println(moneda);
        }
    }
}
