package am;

public class ExamConstructor4 {

	public static void main(String[] args) {
		Constructor4 con4 = new Constructor4();
		System.out.println(con4.x + con4.y);
		
		Constructor4 con5 = new Constructor4(1, "hi");
		System.out.println(con5.x + con5.y);

	}

}

class Constructor4 {
	
	int x;
	String y;
	
	//기본 생성자
	Constructor4() {
		x = 10;
		y = "default";
	}
	
	//변수를 가진 생성자
	Constructor4(int value, String str){
		x = value;
		y = str;
	}
	
}