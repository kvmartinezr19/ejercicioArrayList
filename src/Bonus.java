import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bonus {

    public static void main(String[] args) {

        List<Person> personas = new ArrayList<>();
        personas.add(new Person("Katherine", 32));
        personas.add(new Person("Juan", 15));
        personas.add(new Person("Belen", 4));
        personas.add(new Person("Oscar", 38));

        //ordena por edad haciendo uso del comparator
        personas.sort(Comparator.comparing(Person::getAge));
        //uso de for each para imprimir la lista de personas en el orden
        for (Person persona: personas){
            System.out.println(persona.getName() + " ("+ persona.getAge()+")");
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}



