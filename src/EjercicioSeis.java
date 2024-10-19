import java.util.ArrayList;
import java.util.Collections;

public class EjercicioSeis {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Bucaramanga");
        ciudades.add("Medellin");
        ciudades.add("Bogota");
        ciudades.add("Cali");
        ciudades.add("Pereira");

        System.out.println("Lista antes de mezclarla: " +ciudades);

        //Mezcla los elementos del arraylist aleatoriamente
        Collections.shuffle(ciudades);
        System.out.println("Lista mezclada: " +ciudades);
    }
}
