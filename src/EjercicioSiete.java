import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjercicioSiete {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(6);
        numbers.add(12);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Impresión de lista completa: " + numbers);

        //convertir lista en un set que nos elimima duplicados y mantiene el orden de insercion
        Set<Integer> sinDuplicados = new LinkedHashSet<>(numbers);

        System.out.println("Impresion de lista sin duplicados: " + sinDuplicados);
    }
}
