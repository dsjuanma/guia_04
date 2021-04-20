package GuiadeObjetos4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VideoStore {

    private List <Cliente> clientes = new ArrayList<>();
    private List <Pelicula> peliculas = new ArrayList<>();
    private List <Alquiler> alquileres = new ArrayList<>();



    public VideoStore(List<Cliente> clientes, List<Pelicula> peliculas, List<Alquiler> alquileres) {
        this.clientes = clientes;
        this.peliculas = peliculas;
        this.alquileres = alquileres;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public Pelicula buscaPelicula(String titulo ){
        for(Pelicula i : peliculas ){
            if(i != null && i.getTitulo().equals(titulo)){
                return i;
            }
        }
        return null;
    }

    public Cliente buscaCliente(String nombre ){
        for(Cliente i : clientes ){
            if(i != null && i.getNombre().equals(nombre)){
                return i;
            }
        }
        return null;
    }

    public Cliente creaCliente (String nombre,String telefono, String direccion){
        Cliente cliente = new Cliente(nombre,telefono,direccion);
        for(Cliente i : clientes ){
            if(i == null){
                i=cliente;
            }
        }
        return cliente;
    }



}
