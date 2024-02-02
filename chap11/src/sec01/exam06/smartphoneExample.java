package sec01.exam06;

public class smartphoneExample {

	public static void main(String[] args) {
		Smartphone myPhone = new Smartphone("구글","안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);

	}

}
