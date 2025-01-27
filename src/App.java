
import Models.Contacto;
import Utils.ContactoComparator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();
        runAgendaContacto();
    }

    private static void runHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("----- HashSet -----");
        System.out.println("Elementos del HashSet (no se garantiza orden) :");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    private static void runLinkedHashSet() {
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("----- LinkedHashSet -----");
        System.out.println("Elementos del LinkedHashSet (respeta orden de inserción) :");
        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    private static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("----- TreeSet -----");
        System.out.println("Elementos del TreeSet (orden alfabético) :"); //AVL inOrder
        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    private static void runTreeSetConComparador() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetComparador = sets.construirTreeSetConComparador();
        System.out.println("----- TreeSetComparator -----");
        System.out.println("Elementos del TreeSetComparator (ordenados por longitud y luego alfabéticamente):");
        for (String elemento : ejemploTreeSetComparador) {
            System.out.println(elemento);
        }
    }

    private static void runAgendaContacto() {
        System.out.println("----- Agenda de Contactos -----");
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        Contacto c1 = new Contacto("Pedro", "Lopez", "22222222222");
        Contacto c2 = new Contacto(" Luis", "Perez", "0992960046");
        Contacto c3 = new Contacto("Ana", "Perez", "1111111111");
        Contacto c4 = new Contacto("Pedro", "Lopez", "1234567891");

        agenda.add(c1);
        agenda.add(c2);
        agenda.add(c3);
        agenda.add(c4);

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
