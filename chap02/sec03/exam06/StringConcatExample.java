package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8";           //앞에서 부터 계산 10+2까지는 int형
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8);         //괄호 먼저 계산
		System.out.println("str4: " + str4);
			
		
	}

}
