package Ejercicios.Ejercicio17;

import java.util.ArrayList;

public class Carrito {
    //EL CARRITO ES UN ARRAYLIST DEL OBJETO Elemento
    ArrayList <Elemento> c = new ArrayList<Elemento>();

    public void agrega(Elemento e){
        c.add(e);
    }

    public int numeroDeElementos(){
        return c.size();
    }
    //EL IMPORTE TOTAL DEL ARRAY LIST ES IR 1 A 1 POR SUS ELEMENTOS Y OBTENER TU PRECIO Y CANTIDAD
    public double importeTotal(){
        double t= 0;
        for (Elemento elemento : c) {
            t += elemento.precioT();
        }
        return t;
    }

    @Override
    public String toString(){
        String t = "";
        t += "Contenido del carrito\n=====================\n";

        for (Elemento elemento : c) {
            t += elemento + "\n";
        }

        return t;
    }
}
