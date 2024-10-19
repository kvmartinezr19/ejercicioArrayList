import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {
    public static void main(String[] args) {

        //Añadir los numeros del 1 al 15
        List<Integer> listnumbers = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            listnumbers.add(i);
        }
        //Usa un bucle for para imprimir cada número
        System.out.println("Bucle for: ");
        for (int i = 0; i < listnumbers.size(); i++){
            System.out.println(listnumbers.get(i));
        }
        //Usa un bucle for-each para imprimir los mismos números.
        System.out.println("Bucle for-each: ");
        for (int number : listnumbers){
            System.out.println(number);
        }
        //Usa un bucle while para imprimir los números en orden inverso.
        System.out.println("Bucle while: ");
        int indice = listnumbers.size() -1;
        while (indice >= 0){
            System.out.println(listnumbers.get(indice));
            indice--;
        }

    }
}
