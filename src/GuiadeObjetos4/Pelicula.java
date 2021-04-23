package GuiadeObjetos4;

/*
Cada film de su inventario cuenta con un título, una fecha de
lanzamiento, una duración en minutos, una clasificación de audiencia, las siglas del país de
origen y una descripción de la misma

 */



public class Pelicula {


    private static int i = 1;
    private String titulo;
    private String fechaLanzamiento;
    private String duracion;
    private String clasificacion;
    private String origen;
    private String descripcion;
    private static int popularidad;
    private int stock = 1;

    public Pelicula(){

    }

    public Pelicula(String titulo, String fechaLanzamiento, String duracion, String clasificacion, String origen, String descripcion, int stock) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.origen = origen;
        this.descripcion = descripcion;
        this.popularidad = popularidad ;
        this.stock = stock;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripccion() {
        return descripcion;
    }

    public void setDescripccion(String descripccion) {
        this.descripcion = descripccion;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return  "\nFilm: "       +
                "\nPelicula: "       + this.titulo +
                "\nLanzamiento:..... " + this.fechaLanzamiento +
                "\nDuracion:........... " + this.duracion +
                "\nClasificacion:......... " + this.clasificacion+
                "\nOrigen:......... " + this.origen+
                "\nDescripcion:......... " + this.descripcion+
                "\nStock:......... " + this.stock +
                "\npopularidad:......... " + this.popularidad;


    }


}
