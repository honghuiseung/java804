package sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i = 0; i < newIntArray.length; i++) {
			if(i== newIntArray.length-1) {
				System.out.println(newIntArray[i]);
				break; }
			System.out.println(newIntArray[i] + ", ");
		}
	}

}
