package AM;

class FoolException extends Exception {
}

public class Sample3 {
	public static void sayNick(String nick) throws FoolException {
//		try {

		if("fool".equals(nick)) {
			throw new FoolException();
			// throw는 예외를 강제로 발생시킨다.
		}
		System.out.println("당신의 별명은 " + nick + " 입니다. ");
//	}catch(FoolException e) {
//		System.out.println("FoolException이 발생했습니다.");
//	}
	}
	
	public static void main(String[] args) {
		//Sample2 sample = new Sample2();
		try {
		//sayNick("fool");
		sayNick("genious");
		}catch(FoolException e) {
			System.err.println("FoolException이 발생했습니다.");
		}
	}
}