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
    
    public String afinar(boolean afinac){
        if(afinac==true){
            return "se afino el instrumento";
            
        }else{
            return "no es necesario afinar el intrumento";
        }        
    }
    
    public void asigInst(){
        asiginstru = (int)(Math.random()*7)+1;
        switch(asiginstru){
            case 1:
                instrumento = new Guitarra();
                instrumento.getNombre();
                System.out.println(instrumento.getNombre());
                break;
            case 2: 
                instrumento = new Piano();
                System.out.println(instrumento.getNombre());
                break;
            case 3:
                instrumento = new Voz();   
                System.out.println(instrumento.getNombre());
                break;
            case 4:
                instrumento = new Bateria();   
                System.out.println(instrumento.getNombre());
                break;
            case 5:
                instrumento = new Maracas();   
                System.out.println(instrumento.getNombre());
                break;
            case 6:
                instrumento = new Bajo();   
                System.out.println(instrumento.getNombre());
                break;
            case 7:
                instrumento = new Acordeon();   
                System.out.println(instrumento.getNombre());
                break;
        }
    }
    
    
    
}
