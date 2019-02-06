/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author estudiantes
 */
public class Futbolista {
    private String nombre;
    private String apellido;
    private double promedioGoles;
    private double promedioLiga;

    public Futbolista(double promedioLiga) {
        setPromedioLiga(promedioLiga);
    }
    //Analiza el porcentaje en que difiere el futbolista con respecto al promedio de la liga con respecto a goles
    public double analizar(){
        return (((double)promedioGoles)/promedioLiga -1)*100.0;
    }
    //Getter and setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedioPuntos() {
        return promedioGoles;
    }

    public void setPromedioPuntos(double promedioPuntos) {
        this.promedioGoles = promedioPuntos;
    }

    public double getPromedioLiga() {
        return promedioLiga;
    }

    public void setPromedioLiga(double promedioLiga) {
        this.promedioLiga = promedioLiga;
    }
    
   
    
}
