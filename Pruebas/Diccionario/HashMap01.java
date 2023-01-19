package Pruebas.Diccionario;
import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(924, "Amalia Núñez");
        m.put(921, "Cindy Nero");
        m.put(700, "César Vázquez");
        m.put(219, "Víctor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito ");
        //MOSTRAR TODOS LOS VALORES CON UN SOUT
        System.out.println("Los elementos de m son: \n" + m);
        System.out.println();

        System.out.print("El valor de la llave 924 es: ");
        System.out.println(m.get(924));

        System.out.println();

        //MOSTRAR TODOS LOS VALORES CON UN entrySet
        System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
        System.out.println(m.entrySet());

        //MOSTRAR TODOS LOS VALORES CON UN foreach
        System.out.println("\nEntradas del diccionario extraídas una a una:");
        for (Map.Entry pareja: m.entrySet()) {
            System.out.println(pareja);
        }
        //MOSTRAR TODOS LOS VALORES SEPARANDO EL VALOR DE LA LLAVE
        System.out.println("Código\tNombre\n------\t-------------");
        for (Map.Entry pareja: m.entrySet()) {
            System.out.print(pareja.getKey() + "\t");
            System.out.println(pareja.getValue());
        }
        //USO DE containsKey, PARA SABER SI EXISTE EN EL DICCIONARIO LA CLAVE QUE SE PIDA Y PODER ASÍ DEVOLVERLA CON EL MÉTODO get
        System.out.print("Por favor, introduzca un código: ");
        int codigoIntroducido = Integer.parseInt(System.console().readLine());
        if (m.containsKey(codigoIntroducido)) {
            System.out.print("El código " + codigoIntroducido + " corresponde a: ");
            System.out.println(m.get(codigoIntroducido));
        } else {
            System.out.print("El código introducido no existe.");
        }

    }
}
