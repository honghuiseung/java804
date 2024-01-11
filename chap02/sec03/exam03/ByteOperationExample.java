package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;      //int형에서 byte형으로 변환
		System.out.println(result1); //강제 형변환
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;          //byte형에서 int형으로 변환 
		System.out.println(result2);  //자동 형변환
		
	}

}
