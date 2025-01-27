package Models;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() { //El toString retorna los atributos que deseamos
        return nombre + " " + apellido + " - " + telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return Objects.equals(nombre, contacto.nombre) &&
               Objects.equals(apellido, contacto.apellido) &&
               Objects.equals(telefono, contacto.telefono);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, telefono);
    }
}

