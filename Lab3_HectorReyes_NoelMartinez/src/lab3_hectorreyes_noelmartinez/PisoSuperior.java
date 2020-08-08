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
public class PisoSuperior extends Piso {

    ArrayList<Piso> pisoSuperior = new ArrayList();

    public PisoSuperior() {
    }

    public PisoSuperior(String admin, Ranker director, int nivel) {
        super(admin, director, nivel);
    }

    public ArrayList<Piso> getPisoSuperior() {
        return pisoSuperior;
    }

    public void setPisoSuperior(ArrayList<Piso> pisoSuperior) {
        this.pisoSuperior = pisoSuperior;
    }

    public void añadirPiso(Piso piso){
        pisoSuperior.add(piso);
    }
    
    @Override
    public String toString() {
        return "PisoSuperior{" + "pisoSuperior=" + pisoSuperior + '}';
    }

}
