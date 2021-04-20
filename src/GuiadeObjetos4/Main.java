package GuiadeObjetos4;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        //ArrayList<VideoStore> videoClub = new ArrayList<VideoStore>();
        Cliente cliente1 = new Cliente("Roberto","223423423","Strobel 1623" );
        Cliente cliente2 = new Cliente("Marcelo","22343244","Fuchi 1123" );
        Cliente cliente3 = new Cliente("Felipe","2234514234","Luna 1233" );
        Cliente cliente4 = new Cliente("Nicolas","223451342","Cartana 1123" );
        List <Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        for(Cliente i : clientes){
            if(i != null)
                System.out.println(i);
        }

        Pelicula pelicula1 = new Pelicula("Terminator 1", "Enero 2021", "180 minutos",Clasificacion.G, "USA","Un tipo que secuestra un pibe y mata un policia",1);
        Pelicula pelicula2 = new Pelicula("Terminator 2", "febrero 2021", "180 minutos",Clasificacion.NC17, "USA","Un tipo que secuestra un pibe y mata un policia",1);
        Pelicula pelicula3 = new Pelicula("Terminator 3", "marzo 2021", "180 minutos",Clasificacion.PG13, "USA","Un tipo que secuestra un pibe y mata un policia",1);
        Pelicula pelicula4 = new Pelicula("Terminator 4", "abril 2021", "180 minutos", Clasificacion.UNRATED,"USA","Un tipo que secuestra un pibe y mata un policia",1);
        List <Pelicula> peliculas = new ArrayList<>();
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);
        for(Pelicula i : peliculas){
            if(i != null)
                System.out.println(i);
        }

        Alquiler alquiler = new Alquiler(cliente1,pelicula1, LocalDateTime.now());
        System.out.println(alquiler);
















        }
}
