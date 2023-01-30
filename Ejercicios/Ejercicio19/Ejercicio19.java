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
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;

public class Ejercicio19 {
    private static ArrayList<String> obtenerSinonimos(String palabra, HashMap<String, String> dic){
        String traduccion = dic.get(palabra);
        ArrayList<String> sinonimos = new ArrayList<String>();
        for(Map.Entry entrada:dic.entrySet()){
            if(!entrada.getKey().equals(palabra) && entrada.getValue().equals(traduccion))
                sinonimos.add((String)entrada.getKey());
        }
        return sinonimos;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> dic = new HashMap<String, String>();
        dic.put("caliente", "hot");
        dic.put("rojo", "red");
        dic.put("ardiente", "hot");
        dic.put("verde", "green");
        dic.put("agujetas", "stiff");
        dic.put("abrasador", "hot");
        dic.put("hierro", "iron");
        dic.put("grande", "big");
        boolean salir = false;
        
        do {
            System.out.println("Introduzca una palabra y le daré los sinónimos: ");
            String palabra = sc.nextLine();
            if(palabra.equals("salir"))
                salir = true;
            else{
                if(dic.containsKey(palabra)){
                    ArrayList<String> sinonimos = obtenerSinonimos(palabra, dic);
                    if(sinonimos.size()>1){
                        String cadena=String.format("Sinónimos de %s: ", palabra);
                        for(int i=0; i < sinonimos.size()-1; i++){
                            cadena+=String.format("%s, ", sinonimos.get(i));
                        }
                        cadena+=sinonimos.get(sinonimos.size()-1);
                        System.out.println(cadena);
                    }
                    else
                        System.out.println("No conozco sinónimos de esa palabra");
                }
                else
                    System.out.println("No conozco esa palabra");
            }
        } while (!salir); 
        sc.close();
    }
}
