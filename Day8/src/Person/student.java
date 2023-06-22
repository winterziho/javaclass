package Person;

public class student extends person{
	
	String id;
	
	void getid() {
		System.out.println(this.id);
	}
	
	student(String name, String id){
		this.name = name;
		this.id = id;
	}
}
