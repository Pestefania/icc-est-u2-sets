import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Sets {

    public Set<String> construirHashSet() {
        Set<String> mihashSet = new HashSet<>();
        mihashSet.add("Manzana");
        mihashSet.add("Pera");
        mihashSet.add("Melocoton");
        mihashSet.add("Melón");
        mihashSet.add("Pera");

        return mihashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> miLinkedHashSet = new LinkedHashSet<>();
        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocoton");
        miLinkedHashSet.add("Melón");
        miLinkedHashSet.add("Pera");

        return miLinkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocoton");
        miTreeSet.add("Melón");
        miTreeSet.add("Pera");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int resultado = Integer.compare(s1.length(), s2.length());
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);
        miTreeSetComparador.add("Melón");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Melocotón");
        miTreeSetComparador.add("Pera"); //Elemento repetido, no se añadirá de nuevo

        return miTreeSetComparador;
    }

}