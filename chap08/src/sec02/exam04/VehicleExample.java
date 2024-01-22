package sec02.exam04;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		//Bus bus = new Bus();
		vehicle.run();
		//vehicle.checkFare();
		Bus bus = (Bus) vehicle; //강제형변환 (버스에만 있는)메소드를 사용하려고 사용
		
		bus.run();
		bus.checkFare();

	}

}
