package Ejercicios.Ejercicio1;

public class Alumno {
    private String nombre;

    public Alumno(String n){
        this.nombre = n;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString(){
        return "Alumno: " + this.nombre;
    }
}
