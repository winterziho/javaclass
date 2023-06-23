package Calculator;

public class Sample {
	public static void main(String[] args) {
		
		System.out.println(Calculator1.add(3));
		System.out.println(Calculator1.add(4));
		
		System.out.println(Calculator2.add(3));
		System.out.println(Calculator2.add(7));
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(7));
	}
}
