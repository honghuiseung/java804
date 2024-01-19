package test.test01;

public class testExample {

	public static void main(String[] args) {
		int sum = 0;

		for(int i=1; i<=10; i++){
			sum += i;
			System.out.print(i);
			if(i==10){ break; }
			System.out.print("+");
		}
		System.out.print("="+sum);
		
		
	}

}
