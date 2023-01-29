package EjercicioExamen;

public class Ejercicio {
    public static void main(String[] args) {
        Universidad Uni = new Universidad();
        Estudiante e1 = new Estudiante("Pedro", 18, "qwert");
        Estudiante e2 = new Estudiante("José", 21, "qwertyuiop");
        Estudiante e3 = new Estudiante("Pedro", 24, "asdfg");
        Estudiante e4 = new Estudiante("Paco", 25, "asdfghjklñ");

        Uni.inscribirEstudiante(e1);
        Uni.inscribirEstudiante(e2);
        Uni.inscribirEstudiante(e3);
        Uni.inscribirEstudiante(e4);
        System.out.println(Uni.listarEstudiantes());

        System.out.println();

        Uni.eliminarEstudiantePorMatricula("qwert");
        System.out.println(Uni.listarEstudiantes());

        System.out.println();

        System.out.println(Uni.listarEstudiantesPorEdad(24));

        System.out.println();
        
        Uni.mostrarLista();
    }
}
