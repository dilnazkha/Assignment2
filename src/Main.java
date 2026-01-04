import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Alikhan", "Akylbekov", "Singer", 27045.78));
        people.add(new Employee("Dilnaz", "Khazadiyaz", "Guitarist", 50000.00));
        people.add(new Student("Patrik", "Starr", 2.50));
        people.add(new Student("Mac", "Donalds", 3.50));

        Collections.sort(people);

        printData(people);
    }
}