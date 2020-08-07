/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_hectorreyes_noelmartinez;

import java.util.ArrayList;

/**
 *
 * @author Onasis Reyes
 */
public class Normal extends Persona {
    
    ArrayList <Prueba> pruebas; 
    private String descripcion;

    public Normal() {
        super();
    }

    public Normal(String descripcion, String nombre, Posicion posiciones, long identificacion, EstadoRegistro estadoRegistro) {
        super(nombre, posiciones, identificacion, estadoRegistro);
        this.descripcion = descripcion;
    }

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Normal{" + "pruebas=" + pruebas + ", descripcion=" + descripcion + '}';
    }
    
}
