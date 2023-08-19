package universidad;

public class Curso {
    private String nombre;
    private int espacioMaximo;
    private int estudiantesInscritos;
    
    public Curso(String nombre, int espacioMaximo) {
        this.nombre = nombre;
        this.espacioMaximo = espacioMaximo;
        this.estudiantesInscritos = 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEspacioMaximo() {
        return espacioMaximo;
    }
    
    public boolean verificaEspacio() {
        return estudiantesInscritos < espacioMaximo;
    }
}
