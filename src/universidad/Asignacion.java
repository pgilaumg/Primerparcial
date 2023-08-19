package universidad;

public class Asignacion {
    private Alumno alumno;
    private Curso curso;
    
    public Asignacion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
    }
    
    public void addCurso() {
        if (curso.verificaEspacio()) {
            curso.estudiantesInscritos++;
            System.out.println("Alumno #" + alumno.imprimirDatos() + " inscrito en el curso " + curso.getNombre());
        } else {
            System.out.println("No hay cupo disponible en el curso " + curso.getNombre());
        }
    }
}
