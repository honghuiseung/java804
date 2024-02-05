package sec01.exam24;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		Integer value = obj;
		System.out.println("value: " + value);
		
		Integer result = obj + 100;
		System.out.println("result: " + result);
	}

}
