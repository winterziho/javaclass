package HW;

public class Quiz9 {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(2.0, 5.0);
	
		System.out.println(rec.getArea());
		
	}

}

class Rectangle{
	
	private double base;
	private double height;
	
	Rectangle (double base, double height){
		this.base = base;
		this.height = height;
	}
	double getArea() {
		return base * height;
	}
}