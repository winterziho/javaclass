package am;

public class ExamConstructor2 {

	public static void main(String[] args) {
		Constructor2 con = new Constructor2(3);
		System.out.println(con.x);

	}

}

class Constructor2 {
	
	int x;
	
	Constructor2(int value) {	//기본생성
		x = value;
	}
	
}