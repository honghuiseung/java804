package sec02.exam02;

public class Exam02 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,4,8,2};
		
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max:" + max);
	}

}
