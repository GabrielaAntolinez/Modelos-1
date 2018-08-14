/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;


public class Musico {
    Instrumen instrumento;
    Instrumen ins;
    int asiginstru;

    
    
    public String tocar(){  
        return "esta tocando";
    }
    
    public void afinar(boolean afinac){
        if(afinac==true){
            System.out.println("Instrumento afinado:");
            
        }else{
            System.out.println("No es necesario afinar el intrumento:");
        }        
    }
    
    public void asigInst(){
        asiginstru = (int)(Math.random()*7)+1;
        switch(asiginstru){
            case 1:
                instrumento = new Guitarra();
                instrumento.getNombre();
                afinar(instrumento.getAfinacion());
                System.out.println("-"+instrumento.getNombre());
                break;
            case 2: 
                instrumento = new Piano();
                afinar(instrumento.getAfinacion());
                System.out.println("-"+instrumento.getNombre());
                break;
            case 3:
                instrumento = new Voz();   
                afinar(instrumento.getAfinacion());
                System.out.println("-"+instrumento.getNombre());
                break;
            case 4:
                instrumento = new Bateria();   
                afinar(instrumento.getAfinacion());
                System.out.println("-"+instrumento.getNombre());
                break;
            case 5:
                instrumento = new Maracas();   
                afinar(instrumento.getAfinacion());
                System.out.println("-"+instrumento.getNombre());
                break;
            case 6:
                instrumento = new Bajo();   
                afinar(instrumento.getAfinacion());
                System.out.println("-"+instrumento.getNombre());
                break;
            case 7:
                instrumento = new Acordeon();
                afinar(instrumento.getAfinacion());
                System.out.println("-"+instrumento.getNombre());
                break;
        }
    }
    
    
    
}
