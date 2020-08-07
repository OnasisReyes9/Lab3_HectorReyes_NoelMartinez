/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_hectorreyes_noelmartinez;

/**
 *
 * @author Onasis Reyes
 */
public class Persona {
    
    private String nombre;
    private Posicion posiciones;
    private long identificacion;
    private EstadoRegistro estadoRegistro;

    public Persona() {
    }

    public Persona(String nombre, Posicion posiciones, long identificacion, EstadoRegistro estadoRegistro) {
        this.nombre = nombre;
        this.posiciones = posiciones;
        this.identificacion = identificacion;
        this.estadoRegistro = estadoRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(Posicion posiciones) {
        this.posiciones = posiciones;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public EstadoRegistro getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(EstadoRegistro estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", posiciones=" + posiciones + ", identificacion=" + identificacion + ", estadoRegistro=" + estadoRegistro + '}';
    }
    
}
