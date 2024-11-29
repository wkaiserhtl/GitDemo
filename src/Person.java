import java.util.Objects;

public class Person {
    private String name;
    private String firstnmae;

    public Person(String name, String firstnmae) {
        this.name = name;
        this.firstnmae = firstnmae;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(firstnmae, person.firstnmae);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstnmae);
    }
}
