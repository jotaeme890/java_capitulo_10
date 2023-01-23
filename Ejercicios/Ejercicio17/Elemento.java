package Ejercicios.Ejercicio17;

public class Elemento {
    private String nombre;
    private double precio;
    private int cantidad;

    public Elemento(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double precioT(){
        return this.cantidad*this.precio;
    }
    
    @Override
    public String toString(){
        return this.nombre +  " PVP: " + this.precio + " Unidades: " + this.cantidad + " Subtotal: " + String.format("%.2f", precioT());
    }
}
