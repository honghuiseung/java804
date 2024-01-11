package sec02.exam06;

public class Test2 {

	public static void main(String[] args) {
		int total = 0;
		int i;
		
		for(i=0; i<10;i++) {
			total+=i+1;
			System.out.print(i+1);
			if(i!=9) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

}
