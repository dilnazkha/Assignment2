public class Person implements Payable, Comparable<Person> {

    protected int id;
    protected String name;
    protected String surname;

    private static int idCounter = 1;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }

    // Should return appropriate position OR "Student"
    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
