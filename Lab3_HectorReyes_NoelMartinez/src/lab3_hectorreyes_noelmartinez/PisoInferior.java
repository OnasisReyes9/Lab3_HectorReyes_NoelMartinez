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
public class PisoInferior extends Piso {
    
    ArrayList <Piso> pisoInferior = new ArrayList();
    
    public PisoInferior() {
        super();
    }

    public PisoInferior(String admin, Ranker director, int nivel) {
        super(admin, director, nivel);
    }

    public ArrayList<Piso> getPisoInferior() {
        return pisoInferior;
    }

    public void setPisoInferior(ArrayList<Piso> pisoInferior) {
        this.pisoInferior = pisoInferior;
    }

    public void añadirPiso(Piso piso){
        pisoInferior.add(piso);
    }
    
    @Override
    public String toString() {
        return "PisoInferior{" + "pisoInferior=" + pisoInferior + '}';
    }

}
