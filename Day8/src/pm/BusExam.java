package pm;

public class BusExam {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();	// 부모의 매서드 
		bus.ppangppang();		// 자신의 매서
		
		Car car = new Car();
		car.run();
		//car.ppangppang(); 
		// 부모는 자식의 매서드를 사용할 수 없다 
	}

}
