
    import java.util.ArrayList;
import java.util.List;

public class Trabajador {
   private String nombre;
   private String dept;
   private int salario;
   private List <Trabajador> subordinados;

    public Trabajador(String nombre, String dept, int salario) {
        this.nombre = nombre;
        this.dept = dept;
        this.salario = salario;
        this.subordinados = subordinados;
    }

   public void add(Trabajador e) {
      subordinados.add(e);
   }

   public void remove(Trabajador e) {
      subordinados.remove(e);
   }

   public List<Trabajador> getSubordinados(){
     return subordinados;
   }

   public String toString(){
      return ("Trabajador :[ nombre : " + nombre + ", dept : " + dept + ", salario :" + salario+" ]");
   }   
}


