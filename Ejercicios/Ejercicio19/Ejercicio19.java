/**
 * 19 Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
 * proporciona a continuación. El programa preguntará una palabra y dará una
 * lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
 * se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
 * candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
 * “caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
 * “hot”), por tanto solo tendrá que buscar las palabras en español que también
 * signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
 * (“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
 * sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
 * Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
 * esa palabra”. El usuario sale del programa escribiendo la palabra “salir”.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio19;

import java.util.*;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<String, String>();
        //AÑADIMOS LOS VALORES AL HASHMAP
        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        String palabra = "";

        do {
            System.out.print("Dime la palabra de la que quieres saber los sinónimos: ");
            palabra = sc.nextLine();

            if(!diccionario.containsValue(palabra)){
                System.out.println("No conozco esa palabra");
            } else{
                String traduccion = diccionario.get(palabra);
                System.out.print("Sinónimos de " + palabra + ": ");

                ArrayList<String> sinonimos = new ArrayList<> ();
                
                for(Map.Entry entrada : diccionario.entrySet()){
                    if(!entrada.getKey().equals(palabra) && entrada.getValue().equals(diccionario)){
                        sinonimos.add((String)entrada.getKey());
                    }
                }
                for (String string : sinonimos) {
                    System.out.print(string + " ");
                }
                System.out.println();
            }
        } while (!palabra.equals("salir"));
        sc.close();
    }
}
