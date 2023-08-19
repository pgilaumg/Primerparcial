/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author pedro
 */
public class Catedratico {

    private static int contadorId = 0;
    private Integer codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;
    private String profesion;

    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
        this.codigoCatedratico = ++contadorId;
    }

    public void imprimirDatos() {
        System.out.println("Catedratico{" + "codigoCatedratico=" + codigoCatedratico + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", profesion=" + profesion + '}');
    }

}
