package OrderByAge;

public class Person {
    private String name;
    private int ID;
    private int age;

    public Person(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %d is %d years old.",this.name,this.ID,this.age);
    }
}
