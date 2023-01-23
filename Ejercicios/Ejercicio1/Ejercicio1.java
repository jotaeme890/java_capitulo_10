/**
 * 1 Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alumno;
        ArrayList<Alumno> n = new ArrayList<Alumno>();

        for (int i = 0; i < 6; i++) {
            System.out.print("Dime el nombre del alumno: ");
            alumno = sc.next();
            n.add(new Alumno(alumno));
        }

        for(Alumno a : n){
            //AQUÍ SALDRÍA EL toString DE LA CLASE ALUMNO, YA QUE ES SU sout
            System.out.println(a);
        }
        sc.close();
    }
}