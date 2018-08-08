/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;


public class Musico {
    Instrumen ins;
    String Instrumento;

    public String getInstrumento() {
        return Instrumento;
    }

    public void setInstrumento(String Instrumento) {
        this.Instrumento = Instrumento;
    }
    
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
    
    
    
}
