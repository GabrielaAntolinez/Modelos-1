/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

/**
 *
 * @author Estudiantes
 */
public abstract class Instrumen {
    String Nombre;
    String Tipo;
    Boolean afinacion;
    public Instrumen() {
   
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Boolean getAfinacion() {
        return afinacion;
    }

    public void setAfinacion(Boolean afinacion) {
        this.afinacion = afinacion;
    }

    
    
        
}
