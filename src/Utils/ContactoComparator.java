package Utils;

import Models.Contacto;
import java.util.Comparator;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Primero comparamos los apellidos
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

        // Si los apellidos son iguales, comparamos los nombres
        int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }

        // Si los apellidos y nombres son iguales, comparamos los teléfonos
        return c1.getTelefono().compareTo(c2.getTelefono());
    }
}