package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 10; // L을 생략하면 int로 자동변환됨
		long var2 = 20L;
		long var5 = 2147483647; // 2147483648부터 에러남 
		long var6 = -2147483648; // 음수는 -2147483648부터
		//long var3 = 1000000000000; int형이라서 에러남
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
