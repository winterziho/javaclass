package Tv;


class exTv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void ChannelUp() {
		++channel;
	}
	
	void ChannelDown() {
		--channel;
	}
}