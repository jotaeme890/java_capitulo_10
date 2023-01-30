/**
 * 21 La asociación “Amigos de los anfibios” nos ha encargado una aplicación
 * educativa sobre estos animalitos. Crea un programa que pida al usuario el tipo
 * de anfibio y que, a continuación, nos muestre su hábitat y su alimentación. Si
 * el tipo de anfibio introducido no existe, se debe mostrar el mensaje “Ese tipo
 * de anfibio no existe”
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio21;

import java.util.*;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> habitat = new HashMap<>();
        HashMap<String, String> alimentacion = new HashMap<>();
        habitat.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas.");
        habitat.put("salamandra", "Ecosistemas húmedos.");
        habitat.put("sapo", "En cualquier sitio salvo el desierto y la Antártida.");
        habitat.put("tritón", "América y África.");
        alimentacion.put("rana", "Larvas e insectos.");
        alimentacion.put("salamandra", "Pequeños crustáceos e insectos.");
        alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores.");
        alimentacion.put("tritón", "Insectos.");

        System.out.print("Dime el tipo de anfibio: ");
        String anfibio = sc.nextLine();

        if (!habitat.containsKey(anfibio)) {
            System.out.println("Ese tipo de anfibio no existe.");
        } else {
            System.out.println("Hábitat: " + habitat.get(anfibio));
            System.out.println("Alimentación: " + alimentacion.get(anfibio));
        }
        sc.close();
    }
}
