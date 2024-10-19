import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {
    public static void main(String[] args) {

        String fruit1 = "Apple";
        String fruit2 = "Banana";
        String fruit3 = "Cherry";

        List<String> listfruits = new ArrayList<>();

        listfruits.add(fruit1);
        listfruits.add(fruit2);
        listfruits.add(fruit3);

        //Imprime la cantidad de elementos
        System.out.println("La cantidad de elementos es: " +listfruits.size());
        //Imprime los elemntos de la lista
        System.out.println(listfruits);
        //Elimina Banana de la lista
        listfruits.remove(1);
        System.out.println(listfruits);
        //Cambiar Cherry por Orange
        listfruits.set(1, "Orange");
        System.out.println(listfruits);
    }
}
