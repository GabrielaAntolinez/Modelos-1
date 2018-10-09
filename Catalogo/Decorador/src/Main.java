/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angiegabrielaantolinezsegura
 */
public class Main {
   public static void main(String[] args) {

      Figura circulo = new Circulo();

      Figura CirculoAzul = new ColorDecorador(new Circulo());

      Figura TrianguloAzul = new ColorDecorador(new Triangulo());
      System.out.println("Circulo con borde negro.");
      circulo.draw();

      System.out.println("\nCirculo de borde azul.");
      CirculoAzul.draw();

      System.out.println("\nTriangulo de borde azul. ");
      TrianguloAzul.draw();
   }
}

