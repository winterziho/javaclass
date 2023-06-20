package pm;

public class Rectangle {

	public static void main(String[] args) {

		Rec rec = new Rec(10.0, 10.0);
	
		System.out.println(rec.getArea());
		
	}

}

class Rec{
	
	private double base;
	private double height;
	
	Rec (double base, double height){
		this.base = base;
		this.height = height;
	}
	double getArea() {
		return base * height;
	}
}