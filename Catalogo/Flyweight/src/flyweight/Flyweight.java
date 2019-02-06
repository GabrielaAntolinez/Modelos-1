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
public class Flyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double promedioGolesLiga = 3.5;
        String nombres[] = {"Cristiano","Leonel","Radamel","James"};
        String apellidos[] = {"Ronaldo", "Messi", "Falcao", "Rodriguez"};
        double promedios [] = {4,3.7,2.8,3.1};
        Futbolista f = new Futbolista(promedioGolesLiga);
        for (int i = 0; i < nombres.length; i++) {
            f.setNombre(nombres[i]);
            f.setApellido(apellidos[i]);
            f.setPromedioPuntos(promedios[i]);
            System.out.println(nombres[i] +" " + apellidos[i] + ": "+ f.analizar() + "%");
            
        }
    }
    
}
