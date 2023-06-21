package am;

public class Animal {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.getName());
		dog.sleep();
		
		HouseDog housedog = new HouseDog();
		housedog.setName("Happy");
		housedog.sleep();
		housedog.sleep(4);
	}

}

class Animal2 {
	
	String name;
	
	void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}

class Dog extends Animal2{
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog{
	void sleep() {
		System.out.println(this.name + " zzz in house" );
	}
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for "  + hour + " hours");
	}
}