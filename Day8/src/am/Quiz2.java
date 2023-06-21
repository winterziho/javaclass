package am;

public class Quiz2 {

	public static void main(String[] args) {
		
	Rectangle rec = new Rectangle();
	Circle circle = new Circle();
	
	rec.area();
	circle.area();
	}

}

class Shape {
	int x = 5;
	int y = 10;
	double r = 3.0;
	double pi = 3.14;
	
	void area() {
		
	};
}

class Rectangle extends Shape {
	void area() {
		int sum = x * y;
		System.out.println(sum);
	}
}

class Circle extends Shape {
	void area() {
		double sum =  pi*r * r ;
		System.out.println(sum);
	}
}