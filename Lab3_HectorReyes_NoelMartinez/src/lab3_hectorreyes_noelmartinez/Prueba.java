/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_hectorreyes_noelmartinez;

import java.util.ArrayList;

/**
 *
 * @author noelg
 */
public class Prueba {
    private String nombrePrueba;
    private Persona evaluadorPrueba;
    private ArrayList<Normal>equipo = new ArrayList();
    private String estado;

    public Prueba() {
    }

    public Prueba(String nombrePrueba, Persona evaluadorPrueba, String estado) {
        this.nombrePrueba = nombrePrueba;
        this.evaluadorPrueba = evaluadorPrueba;
        this.estado = estado;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    public Persona getEvaluadorPrueba() {
        return evaluadorPrueba;
    }

    public void setEvaluadorPrueba(Persona evaluadorPrueba) {
        this.evaluadorPrueba = evaluadorPrueba;
    }

    public ArrayList<Normal> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Normal> equipo) {
        this.equipo = equipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void añadirPersonaAlEquipo(Normal persona){
        equipo.add(persona);
    }
    
    @Override
    public String toString() {
        return "Prueba{" + "nombrePrueba=" + nombrePrueba + ", evaluadorPrueba=" + evaluadorPrueba + ", equipo=" + equipo + ", estado=" + estado + '}';
    }
    
}
