package HW;
class Person {
    public String name;

    Person(String name) {
        this.name = name;
    }
}

public class HW4 {
    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println(person.name);
    }
}