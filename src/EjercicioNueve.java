import java.util.ArrayList;

public class EjercicioNueve {

    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Perro");
        palabras.add("Caballo");
        palabras.add("Gato");
        palabras.add("Elefante");
        palabras.add("Perro");
        palabras.add("Gato");
        palabras.add("Jirafa");
        palabras.add("Perro");
        palabras.add("Murcielago");
        palabras.add("Elefante");
        palabras.add("Perro");

        //Definir variable a contar
        String palabraEspecifica = "Perro";

        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.equals(palabraEspecifica)) {
                contador++;
            }
        }
        System.out.println("La palabra " + palabraEspecifica + " se repite " + contador + " veces");
    }
}
