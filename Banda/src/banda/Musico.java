/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;


public class Musico {
    Instrumen instrumento;
    int asiginstru;

    
    
    
    public void crearIntrumento(){
        asiginstru = (int)(Math.random()*7)+1;
        switch(asiginstru){
            case 1:
                instrumento = new Guitarra();
                
                break;
            case 2: 
                instrumento = new Piano();
              
                break;
            case 3:
                instrumento = new Voz();   
               
                break;
            case 4:
                instrumento = new Bateria();   
                
                break;
            case 5:
                instrumento = new Maracas();   
               
                break;
            case 6:
                instrumento = new Bajo();   
                
                break;
            case 7:
                instrumento = new Acordeon();
                
                break;
        }
        instrumento.getNombre();
        System.out.println(instrumento.getAfinacion());
       
    }
    
    public void tocando(){
        System.out.println("- "+instrumento.getNombre()+" esta tocando ♪");
    }
    
}
