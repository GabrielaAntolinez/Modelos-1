/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angiegabrielaantolinezsegura
 */
public class ColorDecorador extends Decorador {

   public ColorDecorador(Figura Figuradecorada) {
      super(Figuradecorada);		
   }

   @Override
   public void draw() {
      Figuradecorada.draw();	       
      setBordeAzul(Figuradecorada);
   }

   private void setBordeAzul(Figura Figuradecorada){
      System.out.println("Color de Borde: Azul");
   }
}

