
package universidad;

public class Main {
    public static void main(String[] args) {
        Catedratico catedratico1 = new Catedratico();
        Catedratico catedratico2 = new Catedratico();
        Catedratico catedratico3 = new Catedratico();
        
        Curso curso1 = new Curso("Curso A", 2);
        Curso curso2 = new Curso("Curso B", 5);
        Curso curso3 = new Curso("Curso C", 5);
        
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        
        Asignacion asignacion1 = new Asignacion(alumno1, curso1);
        Asignacion asignacion2 = new Asignacion(alumno2, curso2);
        Asignacion asignacion3 = new Asignacion(alumno3, curso3);
        
        asignacion1.addCurso();
        asignacion2.addCurso();
        asignacion3.addCurso();
    }
}
