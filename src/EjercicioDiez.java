import java.util.ArrayList;

public class EjercicioDiez {

    public static void main(String[] args) {

        ArrayList<String> animales = new ArrayList<>();
        animales.add("Gato");
        animales.add("Caballo");
        animales.add("Conejo");
        animales.add("Elefante");
        animales.add("Araña");
        animales.add("Abeja");
        animales.add("Jirafa");
        animales.add("Perro");

        String animalABuscar = "Oruga";

        if (animales.contains(animalABuscar)) {
            System.out.println("El animal " + animalABuscar + " se encuentra en la lista");
        } else {
            System.out.println("El animal " + animalABuscar + " no se encuentra en la lista");
        }

    }
}
