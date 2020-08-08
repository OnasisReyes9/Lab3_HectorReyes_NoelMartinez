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
    private Ranker director;
    private int nivel;
    private ArrayList <Ranker> evaluadores = new ArrayList();
    private ArrayList <Normal> personas = new ArrayList();

    public Piso() {
        super();
    }

    public Piso(String admin, Ranker director, int nivel) {
        this.admin = admin;
        this.director = director;
        this.nivel = nivel;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
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

    public ArrayList<Ranker> getEvaluadores() {
        return evaluadores;
    }

    public void setEvaluadores(ArrayList<Ranker> evaluadores) {
        this.evaluadores = evaluadores;
    }

    public ArrayList<Normal> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Normal> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Piso{" + "admin=" + admin + ", director=" + director + ", nivel=" + nivel + ", evaluadores=" + evaluadores + ", personas=" + personas + '}';
    }
    
}