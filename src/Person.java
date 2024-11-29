import java.util.Objects;

public class Person {
    private final String name;
    private final String firstname;

    public Person(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(firstname, person.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstname);
    }
}
