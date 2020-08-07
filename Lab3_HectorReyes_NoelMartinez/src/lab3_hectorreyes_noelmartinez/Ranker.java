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
public class Ranker extends Persona {
    
    ArrayList<Prueba> pruebasEvauador = new ArrayList();

    public Ranker() {
        super();
    }

    public ArrayList<Prueba> getPruebasEvauador() {
        return pruebasEvauador;
    }

    public void setPruebasEvauador(ArrayList<Prueba> pruebasEvauador) {
        this.pruebasEvauador = pruebasEvauador;
    }

    @Override
    public String toString() {
        return "Ranker{" + "pruebasEvauador=" + pruebasEvauador + '}';
    }
    
}
