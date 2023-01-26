/**
 * 6 Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados en
 * una estructura de la clase HashMap.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //CREAMOS EL HASHMAP
        HashMap <String, String> codigo = new HashMap<>();
        //AÑADIMOS LOS VALORES, EN ESTE CASO NUESTRA LLAVE SERÁ EL NOMBRE DE USUARIO
        codigo.put("Javier", "123");
        codigo.put("Pepe", "123");
        codigo.put("Juan","123");
        //PARA SALIR DEL BUCLE
        int contador = 1;
        boolean salir = false;
        //DATOS A PEDIR
        String codigoIntro = "";
        String nombreIntro = "";

        do{
            //CAPTURAMOS LA EXCEPCIÓN SI METE MAL ALGÚN DATO
            try {
                System.out.print("Usuario: ");
                nombreIntro = System.console().readLine();
                System.out.print("Código: ");
                codigoIntro = System.console().readLine();
            } catch (Exception e) {
                System.out.println("Lo sisento, algún dato no se ha introducido correctamente");
            }

            System.out.println("LLeva " + contador + " intento");
            //COMPRUEBA SI EL HASHMAP TIENE ESTE CLAVE GUARDADA CON containsKey
            if(codigo.containsKey(nombreIntro)){
                //SI LO CONTIENE MIRAREMOS SI TIENE ESTA CLAVE EL MISMO VALOR QUE EL ALMACENADO, PARA ELLO HAREMOS UN get QUE NOS DA EL VALOR, QUE EN ESTE CASO ES EL CÓDIGO
                if(codigo.get(nombreIntro).equals(codigoIntro)){
                    salir = true;
                }
            }
                contador++;
        }while ((!salir) && (contador <= 3));

        if(salir){
            System.out.println("Ha accedido al área restringidda");
        } else{
            System.out.println("Lo siento, usted no tiene acceso al área restringida");
        }
        sc.close();
    }
}