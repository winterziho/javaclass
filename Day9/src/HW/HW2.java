package HW;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }
    void printName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

   
}

public class HW2 {
    public static void main(String[] args) {
        Person person = new Student("John");
        person.printName(); // 에러 발생
    }
}
