package Ejercicios.Ejercicio18;

public class Elemento {
    private String producto;
    private int cantidad;
    private double precio;

    public Elemento(String producto, double precio, int cantidad){
        this.precio = precio;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int a) {
        this.cantidad = a;
    }

    @Override
    public String toString() {
        return this.producto + " PVP: " + String.format("%.2f", this.precio)
        + " Unidades: " + this.cantidad
        + " Subtotal: " + String.format("%.2f", this.precio * this.cantidad);
    }
    
    
}
