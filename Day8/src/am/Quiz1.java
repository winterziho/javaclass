package am;

public class Quiz1 {

	public static void main(String[] args) {
		
		Dog2 dog = new Dog2();
		dog.setName("Dog");
		
		Cat  cat = new Cat();
		cat.setName("cat");
		
		dog.Sound();
		cat.Sound();
	}

}
class Animall{
	String name;
	
	void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	void Sound() {
		System.out.println("mmmm");
		
	}
}

class Dog2 extends Animall{
	void Sound() {
		System.out.println(this.name + "는 월월");
	}
}

class Cat extends Animall {
	void Sound() {
		System.out.println(this.name + "는 야옹");
	}
	
}
