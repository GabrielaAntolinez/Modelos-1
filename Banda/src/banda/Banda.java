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
public class Banda {
    Musico arrayMusicos[]=new Musico[bandaAleatoria()];
    int cantidadIntegrantes;
    
    
    public void tocar(){  
        System.out.println("La banda esta tocando ♪♫");
    }
    public int bandaAleatoria(){
        cantidadIntegrantes= (int)(Math.random()*8)+1;
        return cantidadIntegrantes;
    }
    public void asignar(){
        System.out.println("- "+arrayMusicos.length+" musicos.");
        System.out.println("La banda va a afinar:");
        for (int i = 0; i < arrayMusicos.length; i++) {
            arrayMusicos[i] = new Musico();
            arrayMusicos[i].crearIntrumento();
       
        }
    }
    
    
    
    
    
    
}
