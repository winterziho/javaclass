package Quiz4;

public class test {

	public static void main(String[] args) {
	
		Car car = new Car();
		Bicycle cycle = new Bicycle();
		
		car.speedUp();
		System.out.println(car.speed);
		car.applyBrakes();
		System.out.println(car.speed);
		
		cycle.speedUp();
		System.out.println(cycle.speed);
		cycle.applyBrakes();
		System.out.println(cycle.speed);
		

	}

}
