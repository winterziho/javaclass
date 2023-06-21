package Tv;

public class testTv {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.ChannelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");

	}

}
