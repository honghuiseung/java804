package sec05.exam01;

public class Car {
	//필드
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			System.out.println(this.model + "가 달립니다.(" + this.speed + "km/h)");
		}
	}
}
