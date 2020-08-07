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
public class Piso {
    
    private String admin;
    private Ranker evaluadores;
    private Ranker director;
    private int nivel;
    private ArrayList <Persona> personas = new ArrayList();

    public Piso() {
        super();
    }

    public Piso(String admin, Ranker evaluadores, Ranker director, int nivel) {
        this.admin = admin;
        this.evaluadores = evaluadores;
        this.director = director;
        this.nivel = nivel;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public Ranker getEvaluadores() {
        return evaluadores;
    }

    public void setEvaluadores(Ranker evaluadores) {
        this.evaluadores = evaluadores;
    }

    public Ranker getDirector() {
        return director;
    }

    public void setDirector(Ranker director) {
        this.director = director;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Piso{" + "admin=" + admin + ", evaluadores=" + evaluadores + ", director=" + director + ", nivel=" + nivel + ", personas=" + personas + '}';
    }
    
}
