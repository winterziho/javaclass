package Quiz5;

public class Cat extends Animal {
	void sound() {
		System.out.println("Meow");
	}
	
	void parentSound() {
		super.sound();
	}
}
