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
    Musico musicouno;
    
    int cantidadIntegrantes;
    
    
    public int bandaAleatoria(){
        cantidadIntegrantes= (int)(Math.random()*8)+1;
        return cantidadIntegrantes;
    }
    public void asignar(){
        for (int i = 1; i < cantidadIntegrantes; i++) {
            musicouno = new Musico();
            musicouno.asigInst();
       
        }
    }
    
    
    
    
    
    
}
