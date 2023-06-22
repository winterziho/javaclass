package ExamPrivate;

public class ExamOther extends ExamProtected {
	protected String protectedField = "im protected(Other)";
	
	public void accessProtected( ) {
		System.out.println(protectedField);
	}
}
