package ExamPublic;

import ExamPrivate.PublicOther;

public class Main {

	public static void main(String[] args) {
		
		PublicOther pother = new PublicOther();
		System.out.println(pother.publicField);
		
		PublicSame psame = new PublicSame();
		System.out.println(psame.publicField);

	}

}
