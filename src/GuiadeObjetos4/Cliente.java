package GuiadeObjetos4;


/*
nuestro cliente nos cuenta que le interesa saber acerca de quienes alquilan
sus películas, su nombre, teléfono y dirección.
 */

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String telefono;
    private String direccion;
    List <Alquiler> listAlquileres = new ArrayList<>();

    public Cliente(String nombre,String telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return  "\nCliente: "       +
                "\nNombre:..... " + this.nombre +
                "\nTelefono:........... " + this.telefono +
                "\nDireccion:......... " + this.direccion;

    }
}
