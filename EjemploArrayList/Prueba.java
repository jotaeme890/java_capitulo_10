package EjemploArrayList;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        ArrayDinamico <Integer> a = new ArrayDinamico<Integer>(10);

        do {
            System.out.println("Que quiere hacer en el array");
            System.out.println("1. Longitud de array");
            System.out.println("2. Poner un Valor en una posición");
            System.out.println("3. Borrar una posición");
            System.out.println("4. Poner al final un Valor");
            System.out.println("5. Borrar el último Valor");
            System.out.println("6. Obtener el Valor de una posición");
            System.out.println("Opción: ");
            opcion = sc.nextInt();

        } while (opcion !=7);


        sc.close();
    }
}
