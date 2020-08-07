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
public class Regular extends EstadoRegistro{
    
    private String contraseña;
    private String usuario;

    public Regular() {
        super();
    }

    public Regular(String contraseña, String usuario) {
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Regular{" + "contrase\u00f1a=" + contraseña + ", usuario=" + usuario + '}';
    }
    
}
