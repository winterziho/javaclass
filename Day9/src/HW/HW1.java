package HW;

class MyClass {
    public int data;

    MyClass(int data) {
        this.data = data;
    }
}

public class HW1 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.data);
    }
}
