package GuiadeObjetos4;


import java.time.LocalDateTime;
import java.util.UUID;
import java.time.format.DateTimeFormatter;

public class Alquiler {




    private static int i = 1;
    private Cliente clientes;
    private Pelicula peliculas;
    private int id;
    private LocalDateTime fechaRetiro = LocalDateTime.now();
    private LocalDateTime fechaDevolucion = LocalDateTime.now();
    private DateTimeFormatter fechaRetiroModif = DateTimeFormatter.ofPattern("hh: mm: ss  dd-MMM-yyyy");


    public Alquiler() {
    }

    public Alquiler(Cliente clientes, Pelicula peliculas) {
        this.id = i++;
        this.clientes = clientes;
        this.peliculas = peliculas;
        this.fechaRetiro =LocalDateTime.now();
        this.fechaDevolucion = fechaRetiro.plusDays(2);

    }


    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Pelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDateTime fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return  "\nAlquiler: "       +
                "\n" + this.clientes +
                "\n" + this.peliculas +
                "\nID:......... " + id+
                "\nFecha de Retiro:......... " +this.fechaRetiro.format(fechaRetiroModif)+
                "\nFecha de Devolucion:......... " + this.fechaDevolucion.format(fechaRetiroModif);

    }

}
