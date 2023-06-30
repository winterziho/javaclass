package am;

public class ExamCar {

	public static void main(String[] args) {
		Truck truck = new Truck();
		Van van = new Van();
		van.run();
		Carr[] arr = {truck, van};

	}

}

class Carr{
	
	Carr(){
		
}
	Carr(String name){
		System.out.println("부모의 기본생성자");
	}
	public void run() {
		System.out.println("Car의 run");
	}
}
class Van extends Carr{
	public void run() {
		super.run();	
		System.out.println("Van의 run");
	}
}
class Truck extends Carr{
	Truck(){
			
		System.out.println("자식의 기본생성자");
	}
}