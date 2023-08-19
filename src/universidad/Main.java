package universidad;

public class Main {

    public static void main(String[] args) {

        Catedratico catedratico1 = new Catedratico("Mynor Lopez", "Hacienda de las flores ", "38917896", "Ingeniero");
        Catedratico catedratico2 = new Catedratico("Carlos Ortega", "Hacienda de los Girasoles ", "55447898", "Ingeniero de Datos");
        Catedratico catedratico3 = new Catedratico("Diego Reyes", "Villa Romana", "33418907", "Critico de Cine");

        Curso curso1 = new Curso(1, "Compiladores", 2, 10, catedratico1);
        Curso curso2 = new Curso(2, "Redes", 5, 10, catedratico2);
        Curso curso3 = new Curso(3, "Mate avanzada", 5, 10, catedratico3);

        Alumno alumno1 = new Alumno("Pedro Gil", "Hacienda de las flores", "5892374", "25");
        Alumno alumno2 = new Alumno("Italo Gil", "Hacienda del aguacate", "52342123", "28");
        Alumno alumno3 = new Alumno("Jordi Gonzalez", "Hacienda de la silla", "5588896", "23");

        Asignacion asignacion1 = new Asignacion(alumno1);
        Asignacion asignacion2 = new Asignacion(alumno2);
        Asignacion asignacion3 = new Asignacion(alumno3);

        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso1);
        asignacion2.addCurso(curso1);
        asignacion3.addCurso(curso1);
    }
}
