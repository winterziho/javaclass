package Tv;

public class SmartTv extends exTv{
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
