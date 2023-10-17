package paquete.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        LocalDate fecha=LocalDate.of(2009, 11, 10);
        Libro n= new Libro("Juan gei", "Juan", fecha);
        System.out.println( n.getFecha()+ n.getAutor() );
    }
}////hola 
