package HW;

class Animal {
    public String name;

    Animal (String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void printName() {
        System.out.println("Name: " + name); // 에러 발생
    }
}

public class HW3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Bingo");
        dog.printName();
    }
}

