import java.util.ArrayList;
import java.util.Collections;

public class EjercicioOcho {

    public static void main(String[] args) {

        ArrayList<String> diasSemana = new ArrayList<>();
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");

        System.out.println("Los dias de la semana son: " + diasSemana);

        //Invertir el orden de la lista
        Collections.reverse(diasSemana);
        System.out.println("Dias de la semana invertidos: " + diasSemana);
    }
}