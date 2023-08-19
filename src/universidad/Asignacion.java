package universidad;

import java.util.ArrayList;
import java.util.List;

public final class Asignacion {

    private Alumno alumno;
    private List<Curso> cursos = new ArrayList<>();

    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
    }

    public void addCurso(Curso newCurso) {
        System.out.println("----------------------------------------");
        if (newCurso.verificarEspacio() && !cursos.contains(newCurso)) {
            cursos.add(newCurso);
            int alumnosAsignados = newCurso.getAlumnosAsignados() + 1;
            newCurso.setAlumnosAsignados(alumnosAsignados);
            System.out.println("Asignacion realizada");
            System.out.println("Curso: " + newCurso.getTitulo() + " asignado con exito.");
            alumno.imprimirDatos();
        } else if (cursos.contains(newCurso)) {
            System.out.println("El curso ya ha sido asignado.");
        } else {
            System.out.println("No hay cupo en el curso");
        }
        System.out.println("----------------------------------------");
    }
}
