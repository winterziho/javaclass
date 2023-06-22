package ExamPrivate;

public class MyClass {
	//변수 private 적용되면 다른 클래스에서 접근 불가 
		private String privateField = "im private";
		
		//같은 클래스 내의 매서드를 통해서만 접근 가능 
		public void accessPrivate() {
			System.out.println(privateField);
		}
}
