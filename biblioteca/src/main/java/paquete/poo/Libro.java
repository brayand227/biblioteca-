package paquete.poo;

import java.time.LocalDate;

public class Libro {
    private  String nombre;
    private String autor;
    
    private LocalDate fecha;
    public Libro(String nombre, String autor, LocalDate fecha) {

        assert nombre!=null;
        assert autor!=null;
        assert fecha!=null;

        this.nombre = nombre;
        this.autor = autor;
        this.fecha = fecha;
    }
   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
