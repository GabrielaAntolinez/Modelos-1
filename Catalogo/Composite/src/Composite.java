public class Composite {
   public static void main(String[] args) {
   
      Trabajador CEO = new Trabajador("John","CEO", 30000);

      Trabajador vendedores = new Trabajador("Robert","Ventas", 20000);

      Trabajador publicistas = new Trabajador("Michel","Marketing", 20000);

      Trabajador empleado1 = new Trabajador("Laura","Marketing", 10000);
      Trabajador empleado2 = new Trabajador("Bob","Marketing", 10000);

      Trabajador VentasExecutive1 = new Trabajador("Richard","Ventas", 10000);
      Trabajador VentasExecutive2 = new Trabajador("Rob","Ventas", 10000);

      CEO.add(vendedores);
      CEO.add(publicistas);

      vendedores.add(VentasExecutive1);
      vendedores.add(VentasExecutive2);

      publicistas.add(empleado1);
      publicistas.add(empleado2);

      System.out.println(CEO); 
      
      for (Trabajador headTrabajador : CEO.getSubordinados()) {
         System.out.println(headTrabajador);
         
         for (Trabajador Trabajador : headTrabajador.getSubordinados()) {
            System.out.println(Trabajador);
         }
      }		
   }
}