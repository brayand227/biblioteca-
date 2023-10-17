package paquete.poo;

import java.util.ArrayList;

public class Bibioteca {

   private ArrayList<Libro>libros= new ArrayList<>();
    

    private String nombre;
    private String direccion;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Bibioteca(String nombre, String direccion) {

        assert nombre!=null;
        assert direccion!=null;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String BuscarLibro(String nombre){
    String centinela="este libro no se ecunetra";
   for(Libro i:libros){
       if(i.getNombre().equals(nombre)){
             centinela="Libro disponible";

       }
   }

    return centinela;
    }

  public void agregarLibros(Libro libro){

  libros.add(libro);

  }


    

}
// aseert validaciones, <<Enum>> Local,regional,nacional,mundial