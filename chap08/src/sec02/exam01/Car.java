package sec02.exam01;

public class Car {
	Tire frontLeftTire = new Hankook();
	Tire frontRightTire = new Hankook();
	Tire backLeftTire = new Hankook();
	Tire backRightTire = new Hankook();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}