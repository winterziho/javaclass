package Animal;

public class Sample {

	public static void main(String[] args) {
		
		Animal cat = new Animal();
		System.out.println(cat.name);
		
		cat.setName("body");
		
		
		Animal dog = new Animal();
		dog.setName("Happy");
		
		System.out.println(cat.name);
		System.out.println(dog.name);
		
		int a= 3;
		int b = 4;
		
		Sample sample = new Sample();
		int c = sample.sum(a, b);
		System.out.println(c);
		String x = sample.say();
		System.out.println(x);
		
	}
	
	int sum(int a, int b) {
		return a + b;
	}
	
	String say() {
		return "Hi";
	}
	
	void sum2()

}
