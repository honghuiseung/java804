package sec01.exam09;

public class ClassExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		/*Class clazz = Car.forName("sec01.exam09.Car");
		
		Car car = new Car();
		Class clazz = car.getClass();*/
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
