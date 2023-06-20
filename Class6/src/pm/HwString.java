package pm;

public class HwString {

	public static void main(String[] args) {
		
	StringHolder sth = new StringHolder();
	sth.setStr("Hello java");
	System.out.println(sth.getStr());
	
	}

}

class StringHolder{
	String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}