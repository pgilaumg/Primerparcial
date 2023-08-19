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
    private static int contadorCatedraticos = 1;
    private int numeroCatedratico;
    
    public Catedratico() {
        this.numeroCatedratico = contadorCatedraticos++;
    }
    
    public void imprimirDatos() {
        System.out.println("Catedrático #" + numeroCatedratico);
    }
}
