public class Person {
    private String name;
    private String firstnmae;

    public Person(String name, String firstnmae) {
        this.name = name;
        this.firstnmae = firstnmae;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", firstnmae='" + firstnmae + '\'' +
                '}';
    }
}
