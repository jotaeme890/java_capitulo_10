package EjercicioExamen;

import java.util.*;

public class Universidad {
    HashMap <String, Estudiante> u = new HashMap<>();

    public Universidad(){
        this.u = new HashMap<>();
    }

    public void inscribirEstudiante(Estudiante e){
        if(u.containsKey(e.getmatricula())){
            System.out.println("Este alumno ya esta matriculado");
        } else{
            u.put(e.getmatricula(),e);
        }
    }

    public Estudiante buscarEstudiantePorMatricula(String matricula){
        if(u.containsKey(matricula)){
            return u.get(matricula);
        } else{
            return null;
        }
    }

    public void eliminarEstudiantePorMatricula(String matricula){
        if(u.containsKey(matricula)){
            u.remove(matricula);
        } else{
            System.out.println("Este alumno no está matriculado");
        }
    }

    public ArrayList<Estudiante> listarEstudiantes(){
        ArrayList<Estudiante> e = new ArrayList<>();
        //! PARA CADA ESTUDIANTE CON CLAVE Y VALOR, AÑADELO AL ARRAYLIST DE ESTUDIANTES
        u.forEach((key,estudent)-> e.add(estudent));
        return e;
    }

    public ArrayList<Estudiante> listarEstudiantesPorEdad(int edad){
        ArrayList<Estudiante> e = listarEstudiantes();
        //! QUITAREMOS DEL ARRAY CON TODOS LOS ESTUDIANTES LOS ALUMNOS QUE TENGAN ESA EDAD
        e.removeIf(Estudiante -> Estudiante.getEdad()!=edad);
        return e;
    }

    public void mostrarLista(){
        ArrayList<Estudiante> e = listarEstudiantes();
        for (Estudiante estudiante : e) {
            System.out.println(estudiante);
        }
    }
}
