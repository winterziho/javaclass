package pm;

public class ExamConstructor {

	public static void main(String[] args) {
		// before
		
		BDog bdog = new BDog();
		bdog.setAge(2);
		
		BDog bdog2 = new BDog();
		bdog2.setAge(3);
		
		System.out.println(bdog.getAge());
		System.out.println(bdog2.getAge());
		
		// after
		ADog adog1 = new ADog(2);
		ADog adog2 = new ADog(3);
		
		System.out.println(adog1.getAge());
		System.out.println(adog2.getAge());
		
		
	}

}

class ADog{
	
	// 생성자 (클래스 명과 동일, 리턴이 없다.)	
	ADog(int age) {
		this.age = age;
	}
	
	
	// 멤버 변수 
	int age;
	
	// 세터 
	void setAge(int age) {
		this.age = age;	// this는 호출한 객체의 이름자리
	}
	
	// 게터 
		int getAge() {
			return this.age;	// this는 호출한 객체의 이름자리
		}
		
}

class BDog{
	
	// 멤버 변수 
	int age;
	
	// 세터 
	void setAge(int age) {
		this.age = age;	// this는 호출한 객체의 이름자리
	}
	
	// 게터 
		int getAge() {
			return this.age;	// this는 호출한 객체의 이름자리
		}
		
}