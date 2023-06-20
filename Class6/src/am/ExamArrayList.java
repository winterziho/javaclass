package am;

// ArrayList 를 사용하려면 import 해야한다.
import java.util.ArrayList;

public class ExamArrayList {

	public static void main(String[] args) {
		
		// 배열 생성 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// 배열 초기화가 필요없다. 
		
		// 배열의 요소 추가 
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		// 배열 요소에 접근 
		int num = numbers.get(2);
		numbers.remove(2);
		
		System.out.println(num);
		System.out.println(numbers.size());
		

	}

}
