package GuiadeObjetos4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class VideoStore {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Alquiler> alquileres = new ArrayList<>();
    private static int k = 1;


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

    /***
     *
     * @param Busca una pelicula en particular por el titulo
     * @return
     */

    public Pelicula buscaPelicula(String titulo) {
        for (Pelicula i : peliculas) {
            if (i != null && i.getTitulo().equals(titulo)) {
                return i;
            }
        }
        return null;
    }

    public Cliente buscaCliente(String nombre) {
        for (Cliente i : clientes) {
            if (i != null && i.getNombre().equals(nombre)) {
                return i;
            }
        }
        return null;
    }

    public Cliente creaCliente(String nombre, String telefono, String direccion) {
        Cliente cliente = new Cliente(nombre, telefono, direccion);
        clientes.add(cliente);      // la forma nico
        return cliente; // modo quemado
    }

    public void muestraAlquilerCliente(String nombre){
        Cliente cliente = buscaCliente(nombre);
        for(Alquiler alquileres : cliente.listAlquileres ){
            if(alquileres != null){
                System.out.println(alquileres);
            }
        }

    }

    public Alquiler alquilaPelicula(String nombre, String titulo) {
        Cliente cliente = buscaCliente(nombre);
        if (cliente == null) {
            System.out.println("\nEl cliente no existe, agregar cliente");
        }
        Pelicula pelicula = buscaPelicula(titulo);
        if (pelicula == null) {
            System.out.println("\nLa pelicua no se encuentra disponible para su alquiler..");
        }
        if (cliente != null && pelicula != null && pelicula.getStock() == 0) {
            System.out.println("No hay unidades disponibles para el alquiler");
        }
        if (cliente != null && pelicula != null && pelicula.getStock() > 0) {
            pelicula.setStock(pelicula.getStock() - 1);
            Pelicula pelis = new Pelicula();
            pelicula.setPopularidad(pelicula.getPopularidad() + 1);
            Alquiler alquiler = new Alquiler(cliente, pelicula);
            cliente.listAlquileres.add(alquiler);
            alquileres.add(alquiler);
          /*  for (Alquiler i : alquileres) {
                if (i == null) {
                    i = alquiler;
                }
            }

           */
            return alquiler;
        }
        return null;
    }



    public void devolucionPeli(String nombre, String titulo){
        Cliente cliente = buscaCliente(nombre);
        Pelicula pelicula = buscaPelicula(titulo);
        if (cliente != null && pelicula != null && pelicula.getStock() == 0) {
            pelicula.setStock(pelicula.getStock() + 1);
            System.out.println("Pelicula Devuelta");
            System.out.println(pelicula);

        }
        else
        {
            System.out.println("Un error");
        }
    }
    public void mostrarAlquileres() {
        System.out.println("\nAlquileres vigentes:\n");
        for (Alquiler i : getAlquileres()) {
            if(i!=null){
            System.out.println(i);
        }
            else
            {
            System.out.println("No hay peliculas");
            }
        }
    }

    public List<Pelicula> ordenaPeliculas() {
        List<Pelicula> pelisOrdenadas = peliculas;
        return pelisOrdenadas.stream()
                .sorted((Pelicula p1, Pelicula p2) -> p2.getPopularidad() - p1.getPopularidad())
                .collect(Collectors.toList());
    }

    public List<Pelicula> MuestraPeliculasOrdenadas() {
        List<Pelicula> peliOrnada = MuestraPeliculasOrdenadas();

        System.out.println("\nPeliculas ordenadas por popularidad: \n");

        for (Pelicula pelicula : peliOrnada) {
            System.out.println(pelicula);
        }
        return peliOrnada;
    }

}
