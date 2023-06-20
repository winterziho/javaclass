package am;

public class ExamConstructor {

	public static void main(String[] args) {
		Constructor con = new Constructor();
		System.out.println(con.x);

	}

}

class Constructor {
	
	int x;
	
	Constructor() {	//기본생성
		x = 10;
	}
	
}