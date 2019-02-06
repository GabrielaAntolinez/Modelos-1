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
public class Hincha {
    private String nombre; 
    private String equipo;
    private double partidos; 
    private double altercados; 
    
    public double resultados (){
        return(((double) altercados)/partidos -1)*100.0;
    } 
}
