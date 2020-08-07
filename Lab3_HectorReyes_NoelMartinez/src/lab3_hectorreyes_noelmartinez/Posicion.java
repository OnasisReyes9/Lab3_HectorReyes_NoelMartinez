/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_hectorreyes_noelmartinez;

/**
 *
 * @author noelg
 */
public class Posicion {
    private String nombre;

    public Posicion() {
    }

    public Posicion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Posicion{" + "nombre=" + nombre + '}';
    }
    
    
}
