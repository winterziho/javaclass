package jump;

public class Sample {

	public static void main(String[] args) {
		
			Dog dog = new Dog();
			dog.setName("poppy");
			System.out.println(dog.name);
			dog.sleep();
			
			HouseDog houseDog = new HouseDog();
			houseDog.setName("Happy"); // Animal 상속
			houseDog.sleep();  // Dog 
			houseDog.sleep(3);
	}

}
