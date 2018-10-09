/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angiegabrielaantolinezsegura
 */
public abstract class Decorador implements Figura {
   protected Figura Figuradecorada;

   public Decorador(Figura Figuradecorada){
      this.Figuradecorada = Figuradecorada;
   }

   public void draw(){
      Figuradecorada.draw();
   }	
}

