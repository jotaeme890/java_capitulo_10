package Ejercicios.Ejercicio18;

import java.util.ArrayList;

public class Carrito {
    ArrayList <Elemento> carrito = new ArrayList<>();

    public void agrega (Elemento a){
        boolean existe = false;

        for (Elemento elemento : carrito) {
            //SI EL PRODUCTO ES IGUAL DEL QUE SE AÑADE, SE LE AUMENTA LA CANTIDAD AL PRODUCTO QUE YA ESTÁ EN EL ARRAYLIST
            if(elemento.getProducto().equals(a.getProducto())){
                elemento.setCantidad(elemento.getCantidad() + a.getCantidad());
                existe = true;
            }
        }
        if(!existe){
            carrito.add(a);
        }
    } 

    public int numeroDeElementos() {
        return carrito.size();
    }

    public double importeTotal() {
        double total = 0;
        for (Elemento e : carrito) {
        total += e.getPrecio() * e.getCantidad();
        }
        return total;
    }

    @Override
    public String toString() {
        String pinta = "Contenido del carrito\n=====================\n";
        for (Elemento e : carrito) {
            pinta += e + "\n";
        }
        return pinta;
    }
}
