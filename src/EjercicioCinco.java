import java.util.ArrayList;

public class EjercicioCinco {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        //convertir arraylist en un array de tipo Integer[]
        Integer[] arrayNumbers = numbers.toArray(new Integer[0]);

        for (int number : arrayNumbers) {
            System.out.println(number);
        }
    }
}
