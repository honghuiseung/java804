package sec01.exam06;

public interface RemoteControl {
	//상수 static final
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 public abstract
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
