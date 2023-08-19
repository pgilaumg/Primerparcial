package universidad;

public class Alumno {

    private static int contadorCarnet = 0;
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private String edad;

    public Alumno(String nombre, String direccion, String telefono, String edad) {
        this.carnet = ++contadorCarnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Alumno{" + "carnet=" + carnet + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", edad=" + edad + '}');
    }
}
