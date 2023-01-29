package EjercicioExamen;

public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;
    private static int numEstudiantes;

    public Estudiante(String nombre, int edad, String matricula){
        numEstudiantes++;
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public int getNumEstudiantes(){
        return numEstudiantes;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getmatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        return this.nombre + " tiene " + this.edad + " años y tiene matricula " + matricula;
    }
}
