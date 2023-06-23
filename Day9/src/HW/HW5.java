package HW;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }
    
    public String getName() {
    	return name;
    }
}

class Student {
    void printPersonName(Person person) {
        System.out.println("Name: " + person.getName()); // 에러 발생
    }
}

public class HW5 {
    public static void main(String[] args) {
        Person person = new Person("John");
        Student student = new Student();
        student.printPersonName(person);
    }
}
